package vip.ipav.shiro.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import vip.ipav.shiro.dao.UserMapper;
import vip.ipav.shiro.pojo.RolePermission;
import vip.ipav.shiro.pojo.User;
import vip.ipav.shiro.pojo.UserExample;
import vip.ipav.shiro.pojo.UserRole;

import java.util.*;

/**
 * Created by 89003522 on 2018/1/9.
 */
public class MyShiroRealm extends AuthorizingRealm {
    private static final Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

    @Autowired
    private UserMapper userMapper;

    // 获取授权信息
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        String username = (String) principals.fromRealm(
                getName()).iterator().next();
        if( username != null){
            UserExample userExample = new UserExample();
            userExample.createCriteria()
                    .andUsernameEqualTo(username);
            List<User> list = userMapper.selectByExample(userExample);
            if(list.isEmpty()){
               return null;
            }
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            Set<String> roles = new HashSet<String>();
            Set<String> perSet = new HashSet<String>();
            Iterator<UserRole> it = list.get(0).getUserRoles().iterator();
            while (it.hasNext()){
                UserRole userRole = it.next();
                roles.add(userRole.getRole().getCode());
                Iterator<RolePermission> itt = userRole.getRole().getRolePermissions().iterator();
                while (itt.hasNext()){
                    perSet.add(itt.next().getPermission().getExecute());
                }
            }
            //角色信息
            if(roles != null && !roles.isEmpty()){
                info.addRoles(roles);
            }

            // 权限信息,也可以根据角色信息查找具体的权限信息
            if( perSet != null && !perSet.isEmpty() ){
                info.addStringPermissions(perSet);
            }
            return info;
        }
        return null;
    }

    // 获取认证信息
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken ) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        // 通过表单接收的用户名
        if( token.getUsername() != null){
            UserExample userExample = new UserExample();
            userExample.createCriteria()
                    .andUsernameEqualTo(token.getUsername());
            List<User> list = userMapper.selectByExample(userExample);
            if(!list.isEmpty()
                    && new String(token.getPassword()).equals(list.get(0).getPassword())){
                return new SimpleAuthenticationInfo(
                        token.getUsername(),token.getPassword(),getName());
            }
        }
        return null;
    }
}
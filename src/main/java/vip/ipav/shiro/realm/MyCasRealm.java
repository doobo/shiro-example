package vip.ipav.shiro.realm;

import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import vip.ipav.shiro.dao.UserMapper;
import vip.ipav.shiro.pojo.RolePermission;
import vip.ipav.shiro.pojo.User;
import vip.ipav.shiro.pojo.UserExample;
import vip.ipav.shiro.pojo.UserRole;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by Doobo on 2018/1/31.
 */
public class MyCasRealm extends CasRealm {

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
}

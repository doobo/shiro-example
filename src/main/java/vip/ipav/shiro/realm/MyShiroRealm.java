package vip.ipav.shiro.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by 89003522 on 2018/1/9.
 */
public class MyShiroRealm extends AuthorizingRealm {
    private static final Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);
    // 获取授权信息
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        String username = (String) principals.fromRealm(
                getName()).iterator().next();

        if( username != null ){
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            //角色信息
            Collection<String> roles = new ArrayList<String>(){{
                add("root");
                add("admin");
            }};
            if(roles != null && !roles.isEmpty()){
                info.addRoles(roles);
            }

            // 权限信息,也可以根据角色信息查找具体的权限信息
            Collection<String> pers= new ArrayList<String>(){{
                add("read");
                add("write");
            }};
            if( pers != null && !pers.isEmpty() ){
                info.addStringPermissions(pers);
                return info;
            }
        }
        return null;
    }

    // 获取认证信息
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken ) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        // 通过表单接收的用户名
        String username = token.getUsername();
        if( username != null && "doobo".equals(username)){
            return new SimpleAuthenticationInfo(
                    username,"password",getName());
        }
        return null;
    }
}
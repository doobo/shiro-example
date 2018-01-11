package vip.ipav.shiro.simple;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 89003522 on 2018/1/9.
 */
public class TestUnit {
    private static final Logger logger = LoggerFactory.getLogger(TestUnit.class);

    @Before
    public void init(){
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityUtils.setSecurityManager(factory.getInstance());
    }

    @Test
    public void Login(){
        //设置Session值
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        session.setAttribute( "someKey", "定义到Session里面的值" );

        //获取Token
        UsernamePasswordToken token = new UsernamePasswordToken("doobo", "password");
        token.setRememberMe(false);

        //尝试登陆
        try {
            currentUser.login(token);
            logger.info("now {}",session.getAttribute("someKey"));
            logger.info("登陆成功");
            roles();
            permitted();

            //基于注解的权限控制
            AspectService aspectService = new AspectService();
            aspectService.aspectController();

        } catch (UnknownAccountException uae) {
            logger.warn("now {}","账户不存在");
        } catch (IncorrectCredentialsException ice) {
            logger.warn("now {}","密码不匹配");
        } catch (LockedAccountException lae) {
            logger.warn("now {}","账户锁定");
        } catch (ExcessiveAttemptsException eae) {
            logger.warn("now {}","登陆次数过多");
        } catch (AuthenticationException ae) {
            logger.warn("now {}","认证失败");
        }
    }

    private void roles(){
        if(SecurityUtils.getSubject().hasRole("root")) {
            logger.info("有root角色");
        } else {
            logger.info("没有root角色");
        }
    }

    private void permitted(){
        if(SecurityUtils.getSubject().isPermitted("read")) {
            logger.info("有read权限");
        } else {
            logger.info("没有read权限");
        }
    }
}

package vip.ipav.shiro.simple;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 89003522 on 2018/1/10.
 */
@Aspect
public class AspectService {
    private static final Logger logger = LoggerFactory.getLogger(TestUnit.class);

    @RequiresRoles({"roo"})
    public void aspectController(){
        logger.info("该用户已拥有ROOT角色");
    }
}

package vip.ipav.shiro.service;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Service;

/**
 * Created by Doobo on 2018/1/25.
 */
@Service
public class AOPService {

    public void say(){
        System.out.println("Hello AOP");
    }
}

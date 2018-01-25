package vip.ipav.shiro.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vip.ipav.shiro.service.AOPService;

/**
 * Created by Doobo on 2018/1/25.
 */
@Controller
@RequestMapping("/aop")
public class AopController {

    public AopController() {
        System.out.println("This is AopController!");
    }

    @Autowired
    private AOPService aopService;

    @RequiresRoles({"root","admin"})
    @GetMapping("/next")
    public String toNext(){
        aopService.say();
        return "next";
    }

    @RequiresPermissions("write")
    @GetMapping("/write")
    public String toWrite(){
        return "write";
    }
}

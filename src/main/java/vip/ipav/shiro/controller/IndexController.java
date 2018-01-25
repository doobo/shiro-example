package vip.ipav.shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Doobo on 2018/1/25.
 */
@Controller
public class IndexController {
    @GetMapping("/next")
    public String toNext(){
        return "next";
    }

    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }

    @GetMapping("/write")
    public String toWrite(){
        return "write";
    }

    @GetMapping("/roles")
    public String setRoles(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        //获取Token
        String error = null;
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("doobo", "password");
        token.setRememberMe(false);
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            error = "用户名/密码错误";
        } catch (IncorrectCredentialsException e) {
            error = "用户名/密码错误";
        } catch (AuthenticationException e) {
            //其他错误，比如锁定，如果想单独处理请单独catch处理
            error = "其他错误：" + e.getMessage();
        }
        System.out.println(error);
        if(error != null) {//出错了，返回登录页面
            request.setAttribute("error", error);
            return "login";
        } else {//登录成功
           return "next";
        }
    }
}

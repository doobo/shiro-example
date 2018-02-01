package vip.ipav.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.UnsupportedEncodingException;

/**
 * Created by Doobo on 2018/1/25.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String toIndexPage() throws UnsupportedEncodingException {
        return "index";
    }

    @GetMapping("/next")
    public String toNext(){
        return "next";
    }

    @GetMapping("/write")
    public String toWrite(){
        return "write";
    }
}

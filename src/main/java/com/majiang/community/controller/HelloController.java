package com.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author solang
 * @date 2019-10-01 18:git remote add origin git@github.com:itCcc/community.git05
 */
@Controller
public class HelloController {

    @GetMapping("/index")
    public String Hello(){
        return "/index";
    }
}

package com.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author solang
 * @date 2019-10-01 18:git remote add origin git@github.com:itCcc/community.git05
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String Hello(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}

package com.example.SpringBootDemo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

@Controller
public class TestController {
    @GetMapping(value = "v2/testPage")
    public String testPage(@ApiIgnore Model m){
        m.addAttribute("host","asdfasdfasdf");
        return "ok";
    }

    @GetMapping("/")
    public String index(){
        return "redirect:/swagger-ui.html";
    }
}

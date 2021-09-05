package com.shenlan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/test")
    public ModelAndView test(){
        return null;
    }
}

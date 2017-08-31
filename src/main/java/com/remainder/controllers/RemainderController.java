package com.remainder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lisette on 16/8/17.
 */
// This is the app's homepage.
@Controller
@RequestMapping("remainder")
public class RemainderController {

    //Tells Spring Boot at which path methods should receive requests.
    @RequestMapping(value = "")
    public String index() {

        return "remainder/index";
    }
}

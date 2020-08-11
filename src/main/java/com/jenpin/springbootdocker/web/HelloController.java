package com.jenpin.springbootdocker.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jenpin
 * @date 2019/5/26 20:47
 * @description TODO
 **/
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "hello!";
    }
}

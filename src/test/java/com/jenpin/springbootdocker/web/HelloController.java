package com.jenpin.springbootdocker.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Jenpin
 * @date 2019/5/26 19:18
 * @description TODO
 **/
@RequestMapping("/api")
@RestController
public class HelloController {

    private ThreadLocal<SimpleDateFormat> threadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy/MM/dd hh:mm:ss"));

    @GetMapping("/")
    public String retrieveTime() {
        return threadLocal.get().format(new Date());
    }
}

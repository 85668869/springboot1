package com.learn;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chun on 2017/3/14.
 */
@RestController
public class Example {

    private int num;
    private String count;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
        return "hello" + name;
    }
}

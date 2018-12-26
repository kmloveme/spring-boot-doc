package com.km.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: Spring-boot-doc
 * @Date: 2018/12/26 14:59
 * @Author: kongming
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("main/km")
public class HelloWorldAction {

    @RequestMapping(value = "/sayHello.mvc")
    public String sayHello() {
        return "Say Hello";
    }

}

package com.cybersoft.demospringboot03.controller;
/*
    @Controller: Dùng để dịnh nghĩa đg dẫn mà nội dung đg dẫn trả ra HTML
    @ResponseBody: Giúp cho @Controller có thể trả ra kiểu String dùng để viết API

    @RestController: Là kết hợp của @Controller và @ResponseBody ==> Dùng để viết API
 */
// /hello/cybersoft

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("")
    public String hello(){
        return "Hello Spring boot";
    }
    @GetMapping("/cybersoft")
    public String helloCybersoft(){
        return "Hello Spring Cybersoft";    
    }
}

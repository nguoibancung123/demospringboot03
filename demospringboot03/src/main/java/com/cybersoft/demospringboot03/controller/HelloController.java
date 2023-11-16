package com.cybersoft.demospringboot03.controller;/*
    @Controller: Dùng để dịnh nghĩa đg dẫn mà nội dung đg dẫn trả ra HTML
    @ResponseBody: Giúp cho @Controller có thể trả ra kiểu String dùng để viết API

    @RestController: Là kết hợp của @Controller và @ResponseBody ==> Dùng để viết API
 */
// /hello/cybersoft

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import payload.request.LoginRequest;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // Tham số truyền trên trình duyệt: @RequestParam
    // Tham số truyền ngầm: @RequestParam
    // Tham số đóng vai trò như 1 đg dẫn: @PathVariable
    // Tham số là đối tượng: @ResquestBody
    @GetMapping("")
    public String hello(@RequestParam String hoten, @RequestParam int tuoi){
        return "Hello Spring boot " + hoten + "     - tuoi : " + tuoi;
    }
    @PostMapping("/cybersoft")
    // form-data: Có hỗ trợ truyền file lên
    // form- url: ko hỗ trợ truyền file (rất ít sử dụng)
    // row: hỗ trợ truyền đối tượng
    public String helloCybersoft(@RequestBody LoginRequest loginRequest){
        return "Hello Spring Cybersoft " + loginRequest.getUsername() + " - " + loginRequest.getPassword();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable int id){
        return new ResponseEntity<>("Update " + id, HttpStatus.OK);
    }
}

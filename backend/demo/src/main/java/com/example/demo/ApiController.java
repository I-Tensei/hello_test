package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/message")
    public String getMessage() {
        return "こんにちは、React！（更新）";
    }
}

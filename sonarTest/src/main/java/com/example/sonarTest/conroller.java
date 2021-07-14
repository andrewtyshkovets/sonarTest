package com.example.sonarTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{systemName}/roles")
public class conroller {
    @GetMapping()
    public void getRoles() {
        System.out.println("hello world");
    }
}

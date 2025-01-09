package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("api/orders")
    public class HelloController {
        @GetMapping("{id}")
        public String getOne(
                @PathVariable("id") Integer id
        ) {
            return "Hello" + id;
        }
}

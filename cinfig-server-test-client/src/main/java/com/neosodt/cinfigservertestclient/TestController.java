package com.neosodt.cinfigservertestclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${test.name}")
    private String name;

    @GetMapping("/name")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok(this.name);
    }

}

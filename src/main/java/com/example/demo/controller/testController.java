package com.example.demo.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@Log4j2
public class testController {
    public static final UUID randomUUID = UUID.randomUUID();

    @GetMapping("/test")
    public ResponseEntity<UUID> test(){
      log.info("테스트 중!!!!");
        return ResponseEntity.ok(randomUUID);
    }
}

package com.example.springJpaMapping.controller;

import com.example.springJpaMapping.service.Hl7MessagingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class Hl7Controller
{
    private final Hl7MessagingService hl7MessagingService;

    @GetMapping("/get/orm")
    public String getOrm(){
        String get= String.valueOf(this.hl7MessagingService.create_ADT_A01());
        log.info("employee details by id "+ get);
        System.out.println(get);
        return get;
    }
}


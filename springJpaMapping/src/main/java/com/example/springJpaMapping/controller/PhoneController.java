package com.example.springJpaMapping.controller;

import com.example.springJpaMapping.dto.PhoneDto;
import com.example.springJpaMapping.service.PhoneService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/phone")
public class PhoneController {



        private final PhoneService phoneService;



        @PostMapping("/save")
        public PhoneDto savePhoneno(@RequestBody PhoneDto phoneDto){
            PhoneDto save=this.phoneService.save(phoneDto);
            log.info("saved address"+ save);
            return save;
        }
        @GetMapping("/get")
        public List<PhoneDto> getPhoneNO(){
            List<PhoneDto> getAll=this.phoneService.get();
            log.info("Phone numbers"+ getAll);
            return getAll;
        }

        @GetMapping("get/{id}")
        public PhoneDto getBYId(@PathVariable  Long id){
            PhoneDto get=this.phoneService.getPhoneById(id);
            log.info("phone number details"+ get);
            return get;
        }

        @GetMapping("/countryCode/{countryCode}")
        public PhoneDto getByCountryCode(@PathVariable Integer countryCode){
            PhoneDto get=this.phoneService.getPhoneByCountryCode(countryCode);
            return get;
        }
}


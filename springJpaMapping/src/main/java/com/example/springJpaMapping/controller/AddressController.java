package com.example.springJpaMapping.controller;

import com.example.springJpaMapping.dto.AddressDTO;
import com.example.springJpaMapping.service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/address")
public class AddressController {


    private final AddressService addressService;



    @PostMapping("/save")
    public AddressDTO saveAddress(@RequestBody AddressDTO addressDTO){
        AddressDTO save=this.addressService.save(addressDTO);
        log.info("saved address"+ save);
        return save;
    }
    @GetMapping("/get")
    public List<AddressDTO> getAddress(){
        List<AddressDTO> getAll=this.addressService.get();
        log.info("Employees total list"+ getAll);
        return getAll;
    }

    @GetMapping("get/{id}")
    public AddressDTO getBYId(@PathVariable  Long id){
        AddressDTO get=this.addressService.getAddressByAddressId(id);
        log.info("employee details by id "+ get);
        return get;
    }
//    @PostMapping("/employee/update/{id}")
//    public AddressDTO updateDetails(@PathVariable AddressDTO e ,Integer id){
//        AddressDTO updateDet=this.addressService.UpdateAddressDetails(e,id);
//        log.info("Employee updated details"+updateDet);
//        return updateDet;
//    }

}

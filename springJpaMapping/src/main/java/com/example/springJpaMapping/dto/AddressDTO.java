package com.example.springJpaMapping.dto;

import com.example.springJpaMapping.entities.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {

    private Long id;
    private String street;
    private String city;
    private String country;
    private Employee employee;
}

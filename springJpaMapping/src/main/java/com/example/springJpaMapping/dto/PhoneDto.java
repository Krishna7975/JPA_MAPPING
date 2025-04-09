package com.example.springJpaMapping.dto;

import com.example.springJpaMapping.entities.Employee;
;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDto {

    private Long id;
    private Integer phoneNo;
    private Integer countryCode;
    private Employee employee;
}

package com.example.springJpaMapping.dto;

import com.example.springJpaMapping.entities.Address;
import com.example.springJpaMapping.entities.Phone;
import com.example.springJpaMapping.entities.Projects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;
    private String lastName;
    private String firstName;
    private Long salary;
    private int manager_id;
    private Address address;
    private List<Phone> phone;
    private List<Projects> project;
}

package com.example.springJpaMapping.dto;

import com.example.springJpaMapping.entities.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO {


    private Long id;
    private String projectName;
    private double budget;
    private Employee employee;
}

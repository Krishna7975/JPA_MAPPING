package com.example.springJpaMapping.entities;


import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "projects")
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "project_name")
    private String projectName;
    @Column(name = "budget")
    private double budget;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}

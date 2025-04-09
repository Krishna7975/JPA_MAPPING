package com.example.springJpaMapping.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "lastName")
    private String lastName;
    @Column(name ="firstName")
    private String firstName;
    @Column(name = "salary")
    private Long salary;
    @Column(name = "manager_id")
    private int manager_id;

    @JsonIgnore
    @OneToOne(mappedBy = "employee" ,cascade = CascadeType.ALL)
    private Address address;
    @JsonIgnore
    @OneToMany(mappedBy = "employee" ,cascade = CascadeType.ALL)
    private List<Phone> phone;
    @JsonIgnore
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Projects> project;
}

package com.example.springJpaMapping.entities;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "phone")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "phone_no")
    private Integer phoneNo;
    @Column(name = "country_code" )
    private Integer countryCode;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}

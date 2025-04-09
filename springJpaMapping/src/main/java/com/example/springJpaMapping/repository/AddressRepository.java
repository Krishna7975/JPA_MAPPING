package com.example.springJpaMapping.repository;


import com.example.springJpaMapping.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;


@EnableJpaRepositories
public interface AddressRepository extends JpaRepository<Address, Long> {


    @Query(value = "select * from address  where id =?1 ",nativeQuery = true)
    Optional<Address> findByIdAndQuery(Long id);
}

package com.example.springJpaMapping.repository;

import com.example.springJpaMapping.entities.Employee;
import com.example.springJpaMapping.entities.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;


@EnableJpaRepositories
public interface PhoneRepository extends JpaRepository<Phone,Long> {

    @Query(value = "select * from phone  where id =?1 ",nativeQuery = true)
    Optional<Phone> findByIdAndQuery(Long id);

    @Query(value = "select * from phone where country_code = ?1" , nativeQuery = true)
    Optional<Phone> findByCountryCode(Integer countryCode);
}

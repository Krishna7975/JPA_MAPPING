package com.example.springJpaMapping.repository;

import com.example.springJpaMapping.entities.Address;
import com.example.springJpaMapping.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import java.util.Optional;


@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query(value = "select * from employee  where id =?1 ",nativeQuery = true)
    Optional<Employee> findByIdAndQuery(Long id);


  //  @Query(value = "select * from employee where first_name like
  //  'q%' and last_name like 'k%' and salary < 700000",
  //  nativeQuery = true)
    @Query(value = "select * from employee" +
            " where first_name like 'a%' " +
            "and last_name like 'a%' " +
            "and salary > 700000"
            ,nativeQuery = true)
    Optional<Employee> findBySalary(Long salary);

 //   @Query(value = "select * from employee where firstName like 'a%' and lastName like 'a%' and manager_id = ?1 and salary <700000",nativeQuery = true)
//  @Query(value = "select a from employee a " +
//          "where a.first_name like 'a%'" +
//          " and a.last_name like 'a%'" +
//          " and a.salary<700000")
//   public List<Employee> findQuery();

}

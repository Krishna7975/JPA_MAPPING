package com.example.springJpaMapping.controller;


import com.example.springJpaMapping.dto.EmployeeDTO;
import com.example.springJpaMapping.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequiredArgsConstructor
public class EmployeeController
{


    private final EmployeeService employee;

    @PostMapping("/employee/save")
    public EmployeeDTO saveEmployee(@RequestBody EmployeeDTO e ){
     EmployeeDTO save=this.employee.save(e);
     log.info("Saved Employee are "+ save);
     return save;
    }


    @GetMapping("/employee/get")
    public List<EmployeeDTO> getEmployee(){
    List<EmployeeDTO> getAll=this.employee.get();
    log.info("Employees total list"+ getAll);
    return getAll;
    }


//    @GetMapping("/employee/get/{id}")
//    public EmployeeDTO getBYId(@PathVariable  Long id){
//    EmployeeDTO get=this.employee.getEmployeeById(id);
//    log.info("employee details by id "+ get);
//    return get;
//    }
//
//    @GetMapping("/employee/get/salary")
//    public EmployeeDTO getBySalary(Long salary){
//        EmployeeDTO get=this.employee.getEmploeeBySalary(salary);
//        log.info("employee details by salary  " + get);
//        return get;
//    }

//    @GetMapping("/employee/query")
//    public List<EmployeeDTO> getQuery(){
//        List<EmployeeDTO> query=this.employee.query();
//        log.info("employee query deatils "+query);
//        return query;
//    }

//    @PostMapping("/employee/update/{id}")
//    public EmployeeDTO updateDetails(@PathVariable EmployeeDTO e ,Integer id){
//        EmployeeDTO updateDet=this.employee.UpdateDetails(e,id);
//        log.info("Employee updated details"+updateDet);
//        return updateDet;
//    }

}

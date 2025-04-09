package com.example.springJpaMapping.service;

import com.example.springJpaMapping.dto.EmployeeDTO;
import com.example.springJpaMapping.entities.Employee;
import com.example.springJpaMapping.mapper.EmployeeMapper;
import com.example.springJpaMapping.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeService {


    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;


    public EmployeeDTO save(EmployeeDTO employee){
    Employee save =employeeRepository.save(employeeMapper.toEntity(employee));
    return employeeMapper.toDto(save);
    }

    public List<EmployeeDTO> get(){
     List<Employee> getEmployee=employeeRepository.findAll();
     return employeeMapper.toDto(getEmployee);
    }

    public EmployeeDTO getEmployeeById(Long id){
        Optional<Employee> getById= employeeRepository.findByIdAndQuery(id);
        return  employeeMapper.toDto(getById.get());
    }

    public EmployeeDTO getEmploeeBySalary(Long salary){
        Optional<Employee> getBySalary= employeeRepository.findBySalary(salary);
        return employeeMapper.toDto(getBySalary.get());
    }

    public EmployeeDTO del(){
        employeeRepository.deleteAll();
        return null;
    }

//    public List<EmployeeDTO> query(){
//        List<Employee> ByQuery=employeeRepository.findQuery();
//        return employeeMapper.toDto(ByQuery);
//    }

//    public EmployeeDTO UpdateDetails(EmployeeDTO employeeDTO, Integer id){
//    Optional<Employee> updateDetail=employeeRepository.findById(id);
//    if (updateDetail==null){
//        log.info("There is no record with this entry");
//        return null;
//    }
//    employeeDTO.setEmployee_id(employeeDTO.getEmployee_id());
//    employeeDTO.setLastName(employeeDTO.getLastName());
//    employeeDTO.setFirstName(employeeDTO.getFirstName());
//    employeeDTO.setSalary(employeeDTO.getSalary());
//    employeeDTO.setAddress_id(employeeDTO.getAddress_id());
//    employeeDTO.setManager_id(employeeDTO.getManager_id());
//    Employee emp = employeeRepository.save(employeeMapper.toEntity(employeeDTO));
//    log.info("Updated details "+ emp);
//    return  employeeMapper.toDto(emp);
//    }
 }

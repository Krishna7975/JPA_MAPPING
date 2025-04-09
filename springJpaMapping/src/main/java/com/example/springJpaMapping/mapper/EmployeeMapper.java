package com.example.springJpaMapping.mapper;

import com.example.springJpaMapping.dto.EmployeeDTO;
import com.example.springJpaMapping.entities.Employee;
import org.mapstruct.*;


@Mapper(componentModel = "spring", uses = {AddressMapper.class},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeMapper extends EntityMapper<EmployeeDTO,Employee>{


}

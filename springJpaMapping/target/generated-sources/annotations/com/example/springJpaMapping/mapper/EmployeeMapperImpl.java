package com.example.springJpaMapping.mapper;

import com.example.springJpaMapping.dto.EmployeeDTO;
import com.example.springJpaMapping.entities.Employee;
import com.example.springJpaMapping.entities.Phone;
import com.example.springJpaMapping.entities.Projects;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee toEntity(EmployeeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( dto.getId() );
        employee.setLastName( dto.getLastName() );
        employee.setFirstName( dto.getFirstName() );
        employee.setSalary( dto.getSalary() );
        employee.setManager_id( dto.getManager_id() );
        employee.setAddress( dto.getAddress() );
        List<Phone> list = dto.getPhone();
        if ( list != null ) {
            employee.setPhone( new ArrayList<Phone>( list ) );
        }
        List<Projects> list1 = dto.getProject();
        if ( list1 != null ) {
            employee.setProject( new ArrayList<Projects>( list1 ) );
        }

        return employee;
    }

    @Override
    public EmployeeDTO toDto(Employee entity) {
        if ( entity == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setId( entity.getId() );
        employeeDTO.setLastName( entity.getLastName() );
        employeeDTO.setFirstName( entity.getFirstName() );
        employeeDTO.setSalary( entity.getSalary() );
        employeeDTO.setManager_id( entity.getManager_id() );
        employeeDTO.setAddress( entity.getAddress() );
        List<Phone> list = entity.getPhone();
        if ( list != null ) {
            employeeDTO.setPhone( new ArrayList<Phone>( list ) );
        }
        List<Projects> list1 = entity.getProject();
        if ( list1 != null ) {
            employeeDTO.setProject( new ArrayList<Projects>( list1 ) );
        }

        return employeeDTO;
    }

    @Override
    public List<Employee> toEntity(List<EmployeeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Employee> list = new ArrayList<Employee>( dtoList.size() );
        for ( EmployeeDTO employeeDTO : dtoList ) {
            list.add( toEntity( employeeDTO ) );
        }

        return list;
    }

    @Override
    public List<EmployeeDTO> toDto(List<Employee> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<EmployeeDTO> list = new ArrayList<EmployeeDTO>( entityList.size() );
        for ( Employee employee : entityList ) {
            list.add( toDto( employee ) );
        }

        return list;
    }
}

//package com.example.springJpaMapping.service;
//
//import com.example.springJpaMapping.dto.EmployeeDTO;
//import com.example.springJpaMapping.repository.EmployeeRepository;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.boot.test.context.SpringBootTest;
//
//
//import static org.mockito.Mockito.*;
//
////@RunWith(MockitoJUnitRunner.class)
//@SpringBootTest
//public class EmployeeServiceTest {
//
//    @Mock
//    private EmployeeRepository employeeRepository;
//
//    @InjectMocks
//    private EmployeeService employeeService;
//
//    @Test
//    public void testCreateUser() {
//        EmployeeDTO user = new EmployeeDTO(1L,"cdsdcd","sdfsdf",1245L,1,);
//
//
//        when(employeeService.save(user)).thenReturn(user);
//
//        EmployeeDTO savedUser = employeeService.save(user);
//    }
//
//    @Test
//    public void testDeleteUser() {
//        long userId = 1;
//
//        doNothing().when(employeeRepository).deleteById(userId);
//
//        employeeService.del();
//
//    }
//
//}

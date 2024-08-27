package com.csi.service.test;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import com.csi.service.EmployeeServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeServiceImplTest {
    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @MockBean
    private EmployeeRepo employeeRepoImpl;

    @Test
    public  void saveTest()
    {
        Employee employee = new Employee(101,"DISHA","SATARA",890000,423576890L,new Date(),"DISHA@Gmail.com","DISHA");
       employeeServiceImpl.save(employee);
       Mockito.verify(employeeRepoImpl,Mockito.times(1)).save(employee);

    }
    @Test
    public void findAll()
    {
        Mockito.when(employeeRepoImpl.findAll()).thenReturn(Stream.of(new Employee(101,"VEERA","SATARA",800000,413576890L,new Date(),"VEERA@Gmail.com","VEERA"),
        new Employee(103,"SAI","KARAD",780000,43326890L,new Date(),"SAI@Gmail.com","SAI"),
        new Employee(105,"GATHA","KORIWALE",880000,563576890L,new Date(),"GATHA@Gmail.com","GATHA")).toList());

        Assert.assertEquals(3,employeeServiceImpl.findAll().size());
    }
    @Test
    public void updateTest()
    {
        Employee employee = new Employee(101,"DISHA","SATARA",890000,423576890L,new Date(),"DISHA@Gmail.com","DISHA");
        employeeServiceImpl.save(employee);
        Mockito.verify(employeeRepoImpl,Mockito.times(1)).save(employee);
    }
    @Test
    public void deleteById()
    {
        Employee employee = new Employee(101,"DISHA","SATARA",890000,423576890L,new Date(),"DISHA@Gmail.com","DISHA");
         employeeServiceImpl.deleteById(employee.getEmpId());

         Mockito.verify(employeeRepoImpl,Mockito.times(1)).deleteById(employee.getEmpId());
    }
}

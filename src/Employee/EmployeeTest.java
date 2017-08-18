package Employee;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void shouldReturnId12(){
        Employee testObject=new Employee(12,"Adam","Nawałka",1_000_000);
        Assert.assertEquals(12,testObject.getId());
    }

    @Test
    public void shouldReturnFirstName_Adam(){
        Employee testObject=new Employee(12,"Adam","Nawałka",1_000_000);
        Assert.assertEquals("Adam",testObject.getFirstName());
    }

    @Test
    public void shouldReturnLastName_Nawalka(){
        Employee testObject=new Employee(12,"Adam","Nawałka",1_000_000);
        Assert.assertEquals("Nawałka",testObject.getLastName());
    }

    @Test
    public void shouldReturnName_Adam_Nawalka(){
        Employee testObject=new Employee(12,"Adam","Nawałka",1_000_000);
        Assert.assertEquals("Adam Nawałka",testObject.getName());
    }

    @Test
    public void shouldReturnSalary_1_000_000(){
        Employee testObject=new Employee(12,"Adam","Nawałka",1_000_000);
        Assert.assertEquals(1_000_000,testObject.getSalary());
    }

    @Test
    public void shouldReturnSalary_1_100_000WhenRaiseSalary_10(){
        Employee testObject=new Employee(12,"Adam","Nawałka",1_000_000);
        testObject.raiseSalary(10);
        Assert.assertEquals(1_100_000,testObject.getSalary());
    }


}

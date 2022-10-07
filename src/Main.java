import com.one.dao.EmployeeDAO;
import com.one.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDAO employeeDAO = context.getBean("empdao",EmployeeDAO.class);
        Employee emp = new Employee();
        emp.setName("Bhavya");
        emp.setDepartment("Information technology");
        emp.setSalary(91000);
        employeeDAO.insertEmp(emp);
        System.out.println("Record inserted successfully");
    }
}
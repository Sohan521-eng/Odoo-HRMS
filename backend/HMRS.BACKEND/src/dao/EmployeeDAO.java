package dao;

import java.util.ArrayList;
import model.Employee;

public class EmployeeDAO {

    public void addEmployee(Employee employee) {
        System.out.println("Employee Added");
    }

    public void updateEmployee(Employee employee) {
        System.out.println("Employee Updated");
    }

    public void deleteEmployee(int employeeId) {
        System.out.println("Employee Deleted");
    }

    public Employee getEmployeeById(int employeeId) {
        return null;
    }

    public ArrayList<Employee> getAllEmployees() {
        return new ArrayList<>();
    }
}
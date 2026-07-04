package service;

import dao.EmployeeDAO;
import model.Employee;
import java.util.ArrayList;

public class EmployeeService {

    private EmployeeDAO employeeDAO = new EmployeeDAO();

    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }

    public void deleteEmployee(int employeeId) {
        employeeDAO.deleteEmployee(employeeId);
    }

    public Employee getEmployeeById(int employeeId) {
        return employeeDAO.getEmployeeById(employeeId);
    }

    public ArrayList<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
package service;

import dao.DepartmentDAO;
import model.Department;
import java.util.ArrayList;

public class DepartmentService {

    private DepartmentDAO departmentDAO = new DepartmentDAO();

    public void addDepartment(Department department) {
        departmentDAO.addDepartment(department);
    }

    public ArrayList<Department> getAllDepartments() {
        return departmentDAO.getAllDepartments();
    }
}
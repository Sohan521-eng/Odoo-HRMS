package controller;

import model.Department;
import service.DepartmentService;
import java.util.ArrayList;

public class DepartmentController {

    private DepartmentService departmentService = new DepartmentService();

    public void addDepartment(Department department) {
        departmentService.addDepartment(department);
    }

    public ArrayList<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
}

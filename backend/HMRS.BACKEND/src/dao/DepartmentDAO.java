package dao;

import java.util.ArrayList;
import model.Department;

public class DepartmentDAO {

    public void addDepartment(Department department) {
        System.out.println("Department Added");
    }

    public ArrayList<Department> getAllDepartments() {
        return new ArrayList<>();
    }
}
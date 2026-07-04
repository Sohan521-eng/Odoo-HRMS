package main;

import java.util.Scanner;

import controller.EmployeeController;
import controller.AttendanceController;
import controller.DepartmentController;
import controller.LeaveController;
import controller.UserController;

import model.Employee;
import model.Attendance;
import model.Department;
import model.LeaveRequest;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeController employeeController = new EmployeeController();
        AttendanceController attendanceController = new AttendanceController();
        DepartmentController departmentController = new DepartmentController();
        LeaveController leaveController = new LeaveController();
        UserController userController = new UserController();

        while (true) {

            System.out.println("\n======================================");
            System.out.println("        HRMS MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Employee");
            System.out.println("2. Attendance");
            System.out.println("3. Department");
            System.out.println("4. Leave");
            System.out.println("5. User");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            if (!sc.hasNextInt()) {
    System.out.println("Please enter a number between 1 and 6.");
    sc.next(); // discard the invalid input
    continue;
}

int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    Employee employee = new Employee();
                    employeeController.addEmployee(employee);
                    break;

                case 2:

                    Attendance attendance = new Attendance();
                    attendanceController.markAttendance(attendance);
                    break;

                case 3:

                    Department department = new Department();
                    departmentController.addDepartment(department);
                    break;

                case 4:

                    LeaveRequest leave = new LeaveRequest();
                    leaveController.applyLeave(leave);
                    break;

                case 5:

                    System.out.println("User Module Selected");
                    break;

                case 6:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");

            }

        }

    }

}
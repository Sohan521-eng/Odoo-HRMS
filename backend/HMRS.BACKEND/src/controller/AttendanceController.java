package controller;

import model.Attendance;
import service.AttendanceService;
import java.util.ArrayList;

public class AttendanceController {

    private AttendanceService attendanceService = new AttendanceService();

    public void markAttendance(Attendance attendance) {
        attendanceService.markAttendance(attendance);
    }

    public Attendance getAttendanceById(int attendanceId) {
        return attendanceService.getAttendanceById(attendanceId);
    }

    public ArrayList<Attendance> getAllAttendance() {
        return attendanceService.getAllAttendance();
    }
}

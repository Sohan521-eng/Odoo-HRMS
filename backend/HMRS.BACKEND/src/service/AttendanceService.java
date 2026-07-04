package service;

import dao.AttendanceDAO;
import model.Attendance;
import java.util.ArrayList;

public class AttendanceService {

    private AttendanceDAO attendanceDAO = new AttendanceDAO();

    public void markAttendance(Attendance attendance) {
        attendanceDAO.markAttendance(attendance);
    }

    public Attendance getAttendanceById(int attendanceId) {
        return attendanceDAO.getAttendanceById(attendanceId);
    }

    public ArrayList<Attendance> getAllAttendance() {
        return attendanceDAO.getAllAttendance();
    }
}
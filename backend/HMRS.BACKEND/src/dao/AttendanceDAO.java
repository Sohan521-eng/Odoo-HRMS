package dao;

import java.util.ArrayList;
import model.Attendance;

public class AttendanceDAO {

    public void markAttendance(Attendance attendance) {
        System.out.println("Attendance Marked");
    }

    public Attendance getAttendanceById(int attendanceId) {
        return null;
    }

    public ArrayList<Attendance> getAllAttendance() {
        return new ArrayList<>();
    }
}
package dao;

import java.util.ArrayList;
import model.LeaveRequest;

public class LeaveRequestDAO {

    public void applyLeave(LeaveRequest leave) {
        System.out.println("Leave Applied");
    }

    public void approveLeave(int leaveId) {
        System.out.println("Leave Approved");
    }

    public void rejectLeave(int leaveId) {
        System.out.println("Leave Rejected");
    }

    public ArrayList<LeaveRequest> getAllLeaves() {
        return new ArrayList<>();
    }
}
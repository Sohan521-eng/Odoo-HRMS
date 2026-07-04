package controller;

import model.LeaveRequest;
import service.LeaveService;
import java.util.ArrayList;

public class LeaveController {

    private LeaveService leaveService = new LeaveService();

    public void applyLeave(LeaveRequest leave) {
        leaveService.applyLeave(leave);
    }

    public void approveLeave(int leaveId) {
        leaveService.approveLeave(leaveId);
    }

    public void rejectLeave(int leaveId) {
        leaveService.rejectLeave(leaveId);
    }

    public ArrayList<LeaveRequest> getAllLeaves() {
        return leaveService.getAllLeaves();
    }
}
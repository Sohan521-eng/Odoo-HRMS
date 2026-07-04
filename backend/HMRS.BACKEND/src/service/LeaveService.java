package service;

import dao.LeaveRequestDAO;
import model.LeaveRequest;
import java.util.ArrayList;

public class LeaveService {

    private LeaveRequestDAO leaveDAO = new LeaveRequestDAO();

    public void applyLeave(LeaveRequest leave) {
        leaveDAO.applyLeave(leave);
    }

    public void approveLeave(int leaveId) {
        leaveDAO.approveLeave(leaveId);
    }

    public void rejectLeave(int leaveId) {
        leaveDAO.rejectLeave(leaveId);
    }

    public ArrayList<LeaveRequest> getAllLeaves() {
        return leaveDAO.getAllLeaves();
    }
}
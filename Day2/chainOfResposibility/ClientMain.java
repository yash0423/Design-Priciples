package designPrinciple.chainOfResposibility;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployeeName("Yash");
		leaveRequest.setNoOfDaysLeave(10);
		ILeaveRequestHandler sv = new Supervisor();
		ILeaveRequestHandler pm = new ProjectManager();
		ILeaveRequestHandler hr = new HR();
		sv.nextHandler(pm);
		pm.nextHandler(hr);
		hr.nextHandler(null);
		sv.HandleRequest(leaveRequest);

	}

}

package designPrinciple.chainOfResposibility;

public interface ILeaveRequestHandler {
	void nextHandler(ILeaveRequestHandler next);
	void HandleRequest(LeaveRequest lr);
}

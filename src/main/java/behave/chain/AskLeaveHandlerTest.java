package behave.chain;

public class AskLeaveHandlerTest {

    public static void main(String[] args) {
        AskLeaveHandler handler = new ClassAdviserHandler().first();
        handler.next(new DepartmentHeadHandler()).next(new DeanHandler());
        AskLeaveRequest askLeaveRequest = new AskLeaveRequest(10);
        handler.handler(askLeaveRequest);
    }

}

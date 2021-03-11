package behave.chain.template;

import behave.chain.AskLeaveRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AskLeaveHandlerTemplateTest {

    public static void main(String[] args) {
        AskLeaveRequest askLeaveRequest = new AskLeaveRequest(10);
        AskLeaveHandlerTemplate classAdviserHandler = new AskLeaveHandlerTemplate(ask -> {
            if (ask.askLeaveDays() <= 2) {
                log.info("班主任已批准请假申请");
                return true;
            } else {
                log.info("班主任已拒绝请假申请");
                return false;
            }
        }).first();
        classAdviserHandler
                .next(new AskLeaveHandlerTemplate(ask -> {
                    if (ask.askLeaveDays() <= 7) {
                        log.info("系主任已批准请假申请");
                        return true;
                    } else {
                        log.info("系主任已拒绝请假申请");
                        return false;
                    }
                }))
                .next(new AskLeaveHandlerTemplate(ask -> {
                    if (ask.askLeaveDays() <= 10) {
                        log.info("院长已批准请假申请");
                        return true;
                    } else {
                        log.info("院长已拒绝请假申请");
                        return false;
                    }
                }));
        classAdviserHandler.handler(askLeaveRequest);
    }

}

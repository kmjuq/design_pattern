package behave.chain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DepartmentHeadHandler extends AskLeaveHandler {

    @Override
    public boolean handler(AskLeaveRequest request) {
        if (request.askLeaveDays() <= 7) {
            log.info("系主任已批准请假申请");
            return true;
        } else {
            log.info("系主任已拒绝请假申请");
        }
        if (this.next() != null) {
            return this.next().handler(request);
        } else {
            return false;
        }
    }

}

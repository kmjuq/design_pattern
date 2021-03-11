package behave.chain;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class DeanHandler extends AskLeaveHandler {

    @Override
    public boolean handler(AskLeaveRequest request) {
        if (request.askLeaveDays() <= 10) {
            log.info("院长已批准请假申请");
            return true;
        } else {
            log.info("院长已拒绝请假申请");
        }
        if(this.next() != null){
            return this.next().handler(request);
        }else{
            return false;
        }
    }

}

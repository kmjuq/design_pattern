package behave.chain.template;

import behave.chain.AskLeaveRequest;

import java.util.function.Function;

public class AskLeaveHandlerTemplate {

    private final Function<AskLeaveRequest,Boolean> handler;

    private AskLeaveHandlerTemplate next;

    public AskLeaveHandlerTemplate(Function<AskLeaveRequest, Boolean> handler) {
        this.handler = handler;
    }

    public AskLeaveHandlerTemplate next(){
        return this.next;
    }

    public AskLeaveHandlerTemplate next(AskLeaveHandlerTemplate next){
        this.next = next;
        return this.next;
    }

    public AskLeaveHandlerTemplate first(){
        return this;
    }

    public boolean handler(AskLeaveRequest request) {
        if(this.handler.apply(request)){
            return true;
        }
        if (this.next() != null) {
            return this.next().handler(request);
        } else {
            return false;
        }
    }
}

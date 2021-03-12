package behave.chain.fun;

import behave.chain.AskLeaveRequest;

import java.util.function.Function;

public class AskLeaveHandlerFun {

    private Function<AskLeaveRequest,Boolean> handler;

    private AskLeaveHandlerFun first;

    private AskLeaveHandlerFun last;

    public AskLeaveHandlerFun(Function<AskLeaveRequest, Boolean> handler) {
        this.handler = handler;
        this.first = this;
    }

    public AskLeaveHandlerFun first(){
        return this.first;
    }

    public AskLeaveHandlerFun last(){
        return this.last;
    }

    public AskLeaveHandlerFun last(Function<AskLeaveRequest,Boolean> next){
        this.last = new AskLeaveHandlerFun(next);
        this.last.first = this.first;
        return this.last;
    }

    public boolean handler(AskLeaveRequest request) {
        if(this.handler.apply(request)){
            return true;
        }
        if (this.last() != null) {
            return this.last().handler(request);
        } else {
            return false;
        }
    }
}

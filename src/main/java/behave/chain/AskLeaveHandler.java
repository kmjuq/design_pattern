package behave.chain;

public abstract class AskLeaveHandler {

    private AskLeaveHandler handler;

    public AskLeaveHandler next(){
        return this.handler;
    }

    public AskLeaveHandler next(AskLeaveHandler handler){
        this.handler = handler;
        return this.handler;
    }

    public AskLeaveHandler first(){
        return this;
    }

    public abstract boolean handler(AskLeaveRequest request);
}

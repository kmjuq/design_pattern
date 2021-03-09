package behave.chain;

public abstract class AskLeaveHandler {

    private AskLeaveHandler handler;

    public AskLeaveHandler(AskLeaveHandler handler) {
        this.handler = handler;
    }

    public AskLeaveHandler next(){
        return this.handler;
    }

    abstract boolean handler();
}

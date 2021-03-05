package behave.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteCommand implements Command{

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.excute();
    }
}

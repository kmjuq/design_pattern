package behave.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Receiver {

    private Command command;

    public Receiver(Command command){
        this.command = command;
    }

    public void excute(){
        log.info("receiver ");
    }

}

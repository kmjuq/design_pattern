package behave.observe.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Kmj implements Participant {
    @Override
    public boolean action(String subject) {
        log.info("kemengjian receive notify");
        return "game".equals(subject);
    }

    @Override
    public String toString() {
        return "Kmj";
    }
}

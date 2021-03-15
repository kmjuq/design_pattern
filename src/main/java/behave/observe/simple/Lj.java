package behave.observe.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Lj implements Participant {
    @Override
    public boolean action(String subject) {
        log.info("lijin receive notify");
        return "smoke".equals(subject);
    }

    @Override
    public String toString() {
        return "Lj";
    }
}

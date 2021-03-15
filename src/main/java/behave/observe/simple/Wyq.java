package behave.observe.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Wyq implements Participant {
    @Override
    public boolean action(String subject) {
        log.info("wangyiqiao receive notify");
        return "music".equals(subject);
    }

    @Override
    public String toString() {
        return "Wyq";
    }
}

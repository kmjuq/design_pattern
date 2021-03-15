package behave.observe.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MorningMeeting extends Meeting{
    @Override
    void prepare() {
        log.info("整理思绪");
    }
}

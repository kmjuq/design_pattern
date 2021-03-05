package behave.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyB implements Strategy{
    @Override
    public void strategy() {
        log.info("log strategy b");
    }
}

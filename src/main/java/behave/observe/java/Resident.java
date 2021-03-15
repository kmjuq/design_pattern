package behave.observe.java;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

@Slf4j
public class Resident implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Weather we = (Weather) o;
        switch (we.getWeather()){
            case LOUDY: log.info("天气太冷，需要休息");break;
            case RAINY: log.info("下雨了就在家休息吧");break;
            case SUNNY: log.info("今天可以躺在阳台一天了，开心");break;
        }
    }
}

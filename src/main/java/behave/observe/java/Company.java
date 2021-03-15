package behave.observe.java;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

@Slf4j
public class Company implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Weather we = (Weather) o;
        switch (we.getWeather()){
            case LOUDY: log.info("公司可以组织活动啦");break;
            case RAINY: log.info("下雨了就在家休息吧");break;
            case SUNNY: log.info("大太阳适合远行，动起来");break;
        }
    }
}

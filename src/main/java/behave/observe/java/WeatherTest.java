package behave.observe.java;

public class WeatherTest {

    public static void main(String[] args) {
        Weather weather = new Weather(WeatherEnum.LOUDY);
        weather.addObserver(new Resident());
        weather.addObserver(new Company());
        weather.changeWeather(WeatherEnum.LOUDY);
        weather.changeWeather(WeatherEnum.RAINY);
        weather.changeWeather(WeatherEnum.SUNNY);
    }

}

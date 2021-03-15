package behave.observe.java;

import java.util.Observable;

public class Weather extends Observable {

    private WeatherEnum weather;

    public Weather(WeatherEnum weather) {
        this.weather = weather;
    }

    public void changeWeather(WeatherEnum weather) {
        if (getWeather().equals(weather)) {

        } else {
            this.weather = weather;
            setChanged();
            notifyObservers();
        }
    }

    public WeatherEnum getWeather() {
        return weather;
    }

    public void setWeather(WeatherEnum weather) {
        this.weather = weather;
    }
}

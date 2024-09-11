package study.observer.weather;

import study.observer.weather.data.CurrentConditionsDisplay;
import study.observer.weather.data.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer observer = new CurrentConditionsDisplay();
        weatherData.registerObserver(observer);

        weatherData.setHumidity(1);
        weatherData.setTemperature(5);
        weatherData.setPressure(10);
        weatherData.notifyObservers();

        weatherData.setHumidity(10);
        weatherData.setTemperature(5);
        weatherData.setPressure(100);
        weatherData.notifyObservers();
    }
}

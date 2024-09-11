package study.observer.weather.data;

import lombok.Getter;
import lombok.Setter;
import study.observer.weather.Observer;
import study.observer.weather.Subject;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    List<Observer> observers;
    public WeatherData() {
        observers = new ArrayList<>();
    }
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }
}

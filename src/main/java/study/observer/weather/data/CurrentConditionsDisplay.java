package study.observer.weather.data;

import lombok.Getter;
import lombok.Setter;
import study.observer.weather.DisplayElement;
import study.observer.weather.Observer;

@Getter
@Setter
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public void display() {
        System.out.println("Current Conditions Display: " + temperature + ", " + humidity);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}

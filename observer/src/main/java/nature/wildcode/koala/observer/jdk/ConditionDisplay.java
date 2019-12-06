package nature.wildcode.koala.observer.jdk;

import nature.wildcode.koala.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temp;
    private float pressure;
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temp = weatherData.getTemp();
            this.pressure = weatherData.getPressure();
            this.display();
        }
    }

    @Override
    public void display() {
        System.out.println("ConditionDisplay : " + temp + " " + pressure);
    }
}

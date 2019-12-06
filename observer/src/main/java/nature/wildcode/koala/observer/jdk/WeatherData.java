package nature.wildcode.koala.observer.jdk;

import java.util.Observable;

/**
 *
 */
public class WeatherData extends Observable {
    private float temp;
    private float pressure;

    public void measurementsChange(){
        super.setChanged();
        super.notifyObservers();
    }

    public void setMeasurements(float temp, float pressure){
        this.temp = temp;
        this.pressure = pressure;
        this.measurementsChange();
    }

    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }
}

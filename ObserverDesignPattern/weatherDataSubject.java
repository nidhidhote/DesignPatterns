//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class weatherDataSubject implements WeatherData {
    List<Observer> observerList = new ArrayList();
    float temperature;
    float humidity;

    public weatherDataSubject() {
    }

    public void registerObserver(Observer o) {
        this.observerList.add(o);
    }

    public void deleteObserver(Observer o) {
        if (this.observerList.size() > 0) {
            this.observerList.remove(o);
        }

    }

    public void notifyObserver() {
        for(int i = 0; i < this.observerList.size(); ++i) {
            Observer k = (Observer)this.observerList.get(i);
            k.update(this.temperature, this.humidity);
        }

    }

    public void setMeasurementChange(float temp, float humid) {
        this.temperature = temp;
        this.humidity = humid;
        this.measurementChanged();
    }

    public void measurementChanged() {
        this.notifyObserver();
    }
}

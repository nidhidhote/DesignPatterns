package ObserverDesignPattern;

public class currentConditionDisplay implements Observer, Display {
    weatherDataSubject weatherDataSubject;
    float temperature;
    float humidity;

    public currentConditionDisplay(weatherDataSubject w) {
        this.weatherDataSubject = w;
        this.weatherDataSubject.registerObserver(this);
    }

    public void update(float t, float h) {
        this.temperature = t;
        this.humidity = h;
        this.display();
    }

    public void display() {
        System.out.println("CurrentCondition temperature " + this.temperature + "  Humidity " + this.humidity);
    }
}

package ObserverDesignPattern;

public class statsDisplay implements Observer, Display {
    weatherDataSubject weatherDataSubject;
    float temperature;
    float humidity;
    int average;

    public statsDisplay(weatherDataSubject w) {
        this.weatherDataSubject = w;
        this.weatherDataSubject.registerObserver(this);
    }

    public void update(float t, float h) {
        this.temperature = t;
        this.humidity = h;
        this.average = this.getAverage();
        this.display();
    }

    public int getAverage() {
        return (int)(this.temperature + this.humidity) / 2;
    }

    public void display() {
        System.out.println("Stats Average " + this.average);
    }
}

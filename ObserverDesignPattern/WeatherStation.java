package ObserverDesignPattern;

public class WeatherStation {
    public WeatherStation() {
    }

    public static void main(String[] args) {
        weatherDataSubject weatherDataSubject = new weatherDataSubject();
        new currentConditionDisplay(weatherDataSubject);
        new statsDisplay(weatherDataSubject);
        weatherDataSubject.setMeasurementChange(12.4F, 14.33F);
        weatherDataSubject.setMeasurementChange(34.23F, 123.33F);
    }
}

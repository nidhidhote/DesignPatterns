package ObserverDesignPattern;

public interface WeatherData {
    void registerObserver(Observer var1);

    void notifyObserver();

    void deleteObserver(Observer var1);
}
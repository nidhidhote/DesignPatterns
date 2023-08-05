package DecoratorPattern;

public  abstract class Beverages {
    String description="unknown";
    public String getDescription(){
     return description;
    }
    public abstract double cost();
}

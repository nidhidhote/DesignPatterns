package DecoratorPattern;

public class Milk extends Condiments{
    Beverages beverages;
    public Milk(Beverages b){
        this.beverages=b;
    }
    @Override
    public String getDescription() {
        return beverages.getDescription()+"Milk";
    }

    @Override
    public double cost() {
        return beverages.cost()+0.09;
    }
}

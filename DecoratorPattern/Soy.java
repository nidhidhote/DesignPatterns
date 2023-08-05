package DecoratorPattern;

public class Soy extends Condiments{
    Beverages beverages;
    public Soy(Beverages b){
        this.beverages=b;
    }
    @Override
    public String getDescription() {
       return beverages.getDescription()+"Soy";
    }

    @Override
    public double cost() {
        return beverages.cost()+0.90;
    }
}

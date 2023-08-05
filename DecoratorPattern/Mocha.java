package DecoratorPattern;

public class Mocha extends Condiments{
    Beverages beverages;
    public Mocha(Beverages b){
        this.beverages=b;
    }
    @Override
    public String getDescription() {
        return beverages.getDescription()+"Mocha";
    }

    @Override
    public double cost() {
        return beverages.cost()+0.89;
    }
}

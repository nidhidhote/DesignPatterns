package DecoratorPattern;

public class HouseBlend extends Beverages{
   public HouseBlend(){
       description="HouseBlend";
   }
    @Override
    public double cost() {
        return 2.89;
    }
}

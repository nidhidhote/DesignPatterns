package DecoratorPattern;

public class DarkRoast extends Beverages{
   public DarkRoast(){
       description="DarkRoast";
   }
    @Override
    public double cost() {
        return 0.90;
    }
}

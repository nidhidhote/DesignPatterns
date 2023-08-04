package strategyPattern;

public class flyNoWays implements flyBehaviour{
    @Override
    public void fly() {
        System.out.println("I don't fly");
    }
}

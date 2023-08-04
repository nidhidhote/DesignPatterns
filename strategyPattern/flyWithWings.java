package strategyPattern;

public class flyWithWings implements flyBehaviour{
    @Override
    public void fly() {
        System.out.println("I have wings to fly");
    }
}

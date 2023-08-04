package strategyPattern;

public class AfricanDuck extends Duck{
    public AfricanDuck(){
        flyBehaviour = new flyNoWays();
    }

    @Override
    public void display() {
        System.out.println("I am African Duck");
    }
}

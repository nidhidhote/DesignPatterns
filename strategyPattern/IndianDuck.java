package strategyPattern;

public class IndianDuck extends Duck{
    public  IndianDuck(){
        flyBehaviour = new flyWithWings();
        quackBehavior =new quack();
    }

    @Override
    public void display() {
        System.out.println("I am Indian Duck");
    }
}

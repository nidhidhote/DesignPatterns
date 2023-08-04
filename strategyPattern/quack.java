package strategyPattern;

public class quack implements quackBehavior{
    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}

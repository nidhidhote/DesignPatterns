package strategyPattern;

public abstract class Duck {
    flyBehaviour flyBehaviour;
    quackBehavior quackBehavior;
    public  Duck(){}
    void performFly(){
        flyBehaviour.fly();
    }
    void performQuack(){
        quackBehavior.quack();
    }
    public abstract void display();
}

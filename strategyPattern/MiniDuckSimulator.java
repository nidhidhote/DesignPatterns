package strategyPattern;

public class MiniDuckSimulator {
    public static void main(String []args){
        IndianDuck indianDuck = new IndianDuck();
        indianDuck.performFly();
        indianDuck.performQuack();
        indianDuck.display();
        AfricanDuck africanDuck=new AfricanDuck();
        africanDuck.performFly();
        africanDuck.display();
//        africanDuck.performQuack();
    }
}

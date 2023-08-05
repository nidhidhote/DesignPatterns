package DecoratorPattern;

public class StarBuzzCoffeeShop {
    public static void main(String[] args) {
        Beverages beverages=new Espresso();
        System.out.println(beverages.getDescription()+" "+beverages.cost());
        Beverages beverages1=new Mocha(new DarkRoast());
        beverages1 = new Milk(beverages1);
        beverages1=new Soy(beverages1);
        System.out.println(beverages1.getDescription()+" "+beverages1.cost());
    }
}

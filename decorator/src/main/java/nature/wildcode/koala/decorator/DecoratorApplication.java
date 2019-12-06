package nature.wildcode.koala.decorator;

public class DecoratorApplication {

    public static void main(String[] args) {
        AbstractBeverage beverage = new Espresso();
        AbstractBeverage mc = new Mocha(beverage);
        System.out.println(mc.getDescription() + " " + mc.cost());
    }

}

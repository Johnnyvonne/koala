package nature.wildcode.koala.decorator;

/**
 * 装饰者对象
 */
public class Mocha extends CondimentDecorator {

    AbstractBeverage beverage;

    public Mocha(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return this.beverage.cost() + 2;
    }
}

package nature.wildcode.koala.decorator;

public class Espresso extends AbstractBeverage {

    public Espresso() {
        this.description = "Espresso";
    }

    public double cost() {
        return 1;
    }

}

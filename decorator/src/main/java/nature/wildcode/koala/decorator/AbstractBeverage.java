package nature.wildcode.koala.decorator;

/**
 * 饮尿
 */
public abstract class AbstractBeverage {
    String description = "unknown";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();

}

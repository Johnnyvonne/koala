package nature.wildcode.koala.strategy;

public class StrategyApplication {
    public static void main(String[] args) {
        AbstractDuck uglyLittle = new UglyLittleDuck();
        uglyLittle.setFly(new FlyWithRocket());
        uglyLittle.setQuack(new QuackDongciDaci());
        uglyLittle.display();
        uglyLittle.fly();
        uglyLittle.quack();
        uglyLittle.swim();
        System.out.println("================华丽分割线===============");
        AbstractDuck haokunDuck = new HaokunDuck();
        haokunDuck.setFly(new FlyWithWings());
        haokunDuck.setQuack(new QuackGaga());
        haokunDuck.display();
        haokunDuck.fly();
        haokunDuck.quack();
        haokunDuck.swim();
    }
}

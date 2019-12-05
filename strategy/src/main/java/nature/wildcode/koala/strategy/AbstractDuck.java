package nature.wildcode.koala.strategy;

public abstract class AbstractDuck {
    private Fly fly;
    private Quack quack;

    public abstract void display();

    public void fly() {
        this.fly.fly();
    }

    public void quack() {
        this.quack.quack();
    }

    public void swim() {
        System.out.println("游啊游");
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public void setQuack(Quack quack) {
        this.quack = quack;
    }
}

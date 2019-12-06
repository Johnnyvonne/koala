package nature.wildcode.koala.observer;

public class PublicBoard implements Observer, DisplayElement {
    private String data;
    private Subject subject;

    public PublicBoard(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    @Override
    public void update(String data) {
        this.data = data;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("PublicBoard : " + data);
    }
}

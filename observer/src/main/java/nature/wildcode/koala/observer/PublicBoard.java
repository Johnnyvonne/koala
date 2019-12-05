package nature.wildcode.koala.observer;

public class PublicBoard implements Observer, DisplayElement {
    private String data;
    private ZooSubject zooSubject;

    public PublicBoard(ZooSubject zooSubject) {
        this.zooSubject = zooSubject;
        zooSubject.register(this);
    }

    @Override
    public void update(String data) {
        this.data = data;
        this.display();
    }

    @Override
    public void display() {
        System.out.println(data);
    }
}

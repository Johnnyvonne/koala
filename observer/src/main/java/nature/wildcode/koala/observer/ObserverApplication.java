package nature.wildcode.koala.observer;

public class ObserverApplication {
    public static void main(String[] args) {
        ZooSubject subject = new ZooSubject();
        Observer observer = new PublicBoard(subject);
        subject.setData("ahahahaha");
    }
}

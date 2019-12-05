package nature.wildcode.koala.observer;

import java.util.ArrayList;
import java.util.List;

public class ZooSubject implements Subject {

    private List<Observer> observers;
    private String data;

    public ZooSubject() {
        this.observers = new ArrayList<>();
    }

    public void register(Observer observer) {
        this.observers.add(observer);
    }

    public void remove(Observer observer) {
        int i = this.observers.indexOf(observer);
        if(i > 0){
            this.observers.remove(i);
        }
    }

    public void notifyObservers() {
        for(Observer observer : this.observers){
            observer.update(this.data);
        }
    }

    public void dataChange(){
        this.notifyObservers();
    }

    public void setData(String data){
        this.data = data;
        this.dataChange();
    }
}

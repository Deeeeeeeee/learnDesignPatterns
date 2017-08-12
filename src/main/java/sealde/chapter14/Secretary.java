package sealde.chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sealde on 8/10/17.
 */
public class Secretary implements Subject {
    private String state;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers)
            observer.update();
    }

    @Override
    public String getSubjectState() {
        return null;
    }

    public void setState(String state) {
        this.state = state;
    }
}

package sealde.chapter14;

/**
 * Created by sealde on 8/10/17.
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
    String getSubjectState();
}

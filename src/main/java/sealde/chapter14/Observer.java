package sealde.chapter14;

/**
 * Created by sealde on 8/10/17.
 */
public abstract class Observer {
    protected String name;
    protected Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    abstract void update();
}

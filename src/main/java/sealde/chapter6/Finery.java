package sealde.chapter6;

/**
 * Created by sealde on 8/3/17.
 */
public abstract class Finery extends Person {
    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null)
            component.show();
    }
}

package sealde.chapter20;

/**
 * Created by sealde on 8/17/17.
 */
public interface Iterator {
    Object first();
    Object next();
    boolean isDone();
    Object currentItem();
}

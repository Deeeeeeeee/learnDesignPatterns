package sealde.chapter20;

/**
 * Created by sealde on 8/17/17.
 */
public class ConcreteAggregate implements Aggregate {
    private Object[] items;
    private int count;

    public ConcreteAggregate(int count) {
        this.items = new Object[count];
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object[] getItems() {
        return this.items;
    }
}

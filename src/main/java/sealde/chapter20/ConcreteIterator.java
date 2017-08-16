package sealde.chapter20;

/**
 * Created by sealde on 8/17/17.
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItems()[0];
    }

    @Override
    public Object next() {
        Object ret = null;
        this.current ++;

        if (current < this.aggregate.getItems().length)
            ret = this.aggregate.getItems()[current];
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= this.aggregate.getCount() ? true : false;
    }

    @Override
    public Object currentItem() {
        return this.aggregate.getItems()[current];
    }
}

package sealde.chapter20;

import org.junit.Test;

/**
 * Created by sealde on 8/17/17.
 */
public class IteratorPatternTest {
    @Test
    public void iteratorTest() {
        ConcreteAggregate aggregate = new ConcreteAggregate(6);

        aggregate.getItems()[0] = "大鸟";
        aggregate.getItems()[1] = "小菜";
        aggregate.getItems()[2] = "行李";
        aggregate.getItems()[3] = "老外";
        aggregate.getItems()[4] = "公交内部员工";
        aggregate.getItems()[5] = "小偷";

        Iterator it = new ConcreteIterator(aggregate);
        Object item = it.first();
        while (!it.isDone()) {
            System.out.println(it.currentItem() + "请买车票！");
            it.next();
        }
    }
}

package sealde.chapter23;

import org.junit.Test;

/**
 * Created by sealde on 8/18/17.
 */
public class CommandPatternTest {
    @Test
    public void commandTest() {
        //开店前的准备
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();

        //开门营业 顾客点菜
        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeMuttonCommand2);
        girl.setOrder(bakeChickenWingCommand1);

        //点菜完闭，通知厨房
        girl.notifyCommand();
    }
}

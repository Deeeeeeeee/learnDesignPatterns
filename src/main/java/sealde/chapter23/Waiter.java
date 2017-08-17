package sealde.chapter23;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sealde on 8/18/17.
 */
public class Waiter {
    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command) {
        if (command instanceof BakeChickenWingCommand) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤。");
        } else {
            orders.add(command);
            System.out.println("增加订单：" + command.toString() + "  时间：" + new Date());
        }
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单：" + command.toString() + "  时间：" + new Date());
    }

    public void notifyCommand() {
        for (Command c : orders) {
            c.executeCommand();
        }
    }
}

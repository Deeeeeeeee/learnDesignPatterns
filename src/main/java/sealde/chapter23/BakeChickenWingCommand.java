package sealde.chapter23;

/**
 * Created by sealde on 8/18/17.
 */
public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeChickenWing();
    }

    @Override
    public String toString() {
        return "命令模式.烤鸡翅";
    }
}

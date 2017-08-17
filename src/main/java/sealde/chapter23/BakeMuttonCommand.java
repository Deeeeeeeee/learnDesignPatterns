package sealde.chapter23;

/**
 * Created by sealde on 8/18/17.
 */
public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }

    @Override
    public String toString() {
        return "命令模式.烤羊肉串";
    }
}

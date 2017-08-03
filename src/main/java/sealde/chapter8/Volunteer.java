package sealde.chapter8;

/**
 * Created by sealde on 8/4/17.
 */
public class Volunteer implements LeiFeng {
    @Override
    public void sweep() {
        System.out.println("社区志愿者扫地");
    }

    @Override
    public void wash() {
        System.out.println("社区志愿者洗衣");
    }

    @Override
    public void buyRice() {
        System.out.println("社区志愿者买米");
    }
}

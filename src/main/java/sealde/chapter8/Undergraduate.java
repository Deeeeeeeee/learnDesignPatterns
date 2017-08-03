package sealde.chapter8;

/**
 * Created by sealde on 8/4/17.
 */
public class Undergraduate implements LeiFeng {
    @Override
    public void sweep() {
        System.out.println("大学生扫地");
    }

    @Override
    public void wash() {
        System.out.println("大学生洗衣");
    }

    @Override
    public void buyRice() {
        System.out.println("大学生买米");
    }
}

package sealde.chapter16;

/**
 * Created by sealde on 8/15/17.
 */
public class SleepingState implements State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点 不行了，睡着了。");
    }
}

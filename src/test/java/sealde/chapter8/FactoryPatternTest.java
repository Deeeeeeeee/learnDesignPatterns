package sealde.chapter8;

import org.junit.Test;

/**
 * Created by sealde on 8/4/17.
 */
public class FactoryPatternTest {
    @Test
    public void UGFactoryTest() {
        Factory factory = new UndergraduateFactory();
        LeiFeng leiFeng = factory.createLeiFeng();

        leiFeng.sweep();
        leiFeng.wash();
        leiFeng.buyRice();
    }

    @Test
    public void VTFactoryTest() {
        Factory factory = new VolunteerFactory();
        LeiFeng leiFeng = factory.createLeiFeng();

        leiFeng.sweep();
        leiFeng.wash();
        leiFeng.buyRice();
    }
}

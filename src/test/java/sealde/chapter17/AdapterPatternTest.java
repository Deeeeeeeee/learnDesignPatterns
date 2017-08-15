package sealde.chapter17;

import org.junit.Test;

/**
 * Created by sealde on 8/16/17.
 */
public class AdapterPatternTest {
    @Test
    public void adapterTest() {
        Player b = new Forwards("巴蒂尔");
        b.attack();

        Player m = new Guards("麦克格雷迪");
        m.attack();

        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }
}

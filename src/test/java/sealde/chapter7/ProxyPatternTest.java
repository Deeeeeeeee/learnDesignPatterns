package sealde.chapter7;

import org.junit.Test;

/**
 * Created by sealde on 8/4/17.
 */
public class ProxyPatternTest {
    @Test
    public void proxyTest() {
        SchoolGirl schoolGirl = new SchoolGirl("阿狸");

        GiveGift proxy = new Proxy(schoolGirl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}

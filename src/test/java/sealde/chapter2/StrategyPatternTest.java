package sealde.chapter2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by seal_de on 2017/8/2.
 */
public class StrategyPatternTest {
    @Test
    public void testCashNormal() {
        CashContext cashContext = new CashContext("正常收费");
        double payMoney = cashContext.getResult(600);
        Assert.assertEquals(600, payMoney, 0.00000001);
    }

    @Test
    public void testRebate() {
        CashContext cashContext = new CashContext("打8折");
        double payMoney = cashContext.getResult(600);
        Assert.assertEquals(480, payMoney, 0.00000001);
    }

    @Test
    public void testReturn() {
        CashContext cashContext = new CashContext("满300减100");
        double payMoney = cashContext.getResult(600);
        Assert.assertEquals(400, payMoney, 0.00000001);
    }
}

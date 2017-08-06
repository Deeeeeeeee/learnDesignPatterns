package sealde.chapter12;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sealde on 8/6/17.
 */
public class FacadePatternTest {
    private static final Logger logger = LoggerFactory.getLogger(FacadePatternTest.class);

    @Test
    public void facadeTest() {
        logger.info("第一种买卖股票： ");

        Found found1 = new Found();
        found1.buyFound();
        found1.sellFound();

        logger.info("第二种买卖股票： ");

        Found found2 = new Found();
        found2.buyFound2();
        found2.sellFound2();
    }
}

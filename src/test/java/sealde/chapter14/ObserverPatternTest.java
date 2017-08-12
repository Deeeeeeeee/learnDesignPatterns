package sealde.chapter14;

import org.junit.Test;

/**
 * Created by sealde on 8/13/17.
 */
public class ObserverPatternTest {
    @Test
    public void observerTest() {
        Boss boss = new Boss();

        //看股票的同事
        StockObserver colleagues1 = new StockObserver("股票同事", boss);
        //看NBA的同事
        NBAObserver colleagues2 = new NBAObserver("NBA同事", boss);

        boss.attach(colleagues1);
        boss.attach(colleagues2);

        boss.detach(colleagues1);

        boss.setState("我回来啦！");
        boss.notifyObservers();
    }
}

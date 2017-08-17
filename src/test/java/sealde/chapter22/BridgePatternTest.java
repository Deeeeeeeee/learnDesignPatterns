package sealde.chapter22;

import org.junit.Test;

/**
 * Created by sealde on 8/18/17.
 */
public class BridgePatternTest {
    @Test
    public void bridgeTest() {
        HandsetBrand ab;
        ab = new HandsetBrandN();

        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

        ab = new HandsetBrandM();

        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();
    }
}

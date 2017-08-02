package sealde.chapter2;

/**
 * Created by seal_de on 2017/8/2.
 */
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}

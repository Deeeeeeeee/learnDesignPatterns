package sealde.chapter2;

/**
 * Created by seal_de on 2017/8/2.
 */
public class CashRebate implements CashSuper {
    private double moneyRebate = 1.0;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * this.moneyRebate;
    }
}

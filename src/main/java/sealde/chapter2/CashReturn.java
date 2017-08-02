package sealde.chapter2;

/**
 * Created by seal_de on 2017/8/2.
 */
public class CashReturn implements CashSuper {
    private double moneyCondition = 0.0;
    private double moneyReturn = 0.0;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition)
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        return result;
    }
}

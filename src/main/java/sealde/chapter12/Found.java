package sealde.chapter12;

/**
 * Created by sealde on 8/6/17.
 */
public class Found {
    private Stock1 stock1;
    private Stock2 stock2;
    private Stock3 stock3;
    private NationalDebt1 nationalDebt1;
    private Realty1 realty1;

    public Found() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        stock3 = new Stock3();
        nationalDebt1 = new NationalDebt1();
        realty1 = new Realty1();
    }

    public void buyFound() {
        stock1.buy();
        stock2.buy();
        stock3.buy();
        nationalDebt1.buy();
        realty1.buy();
    }

    public void sellFound() {
        stock1.sell();
        stock2.sell();
        stock3.sell();
        nationalDebt1.sell();
        realty1.sell();
    }

    public void buyFound2() {
        stock3.buy();
        realty1.buy();
    }

    public void sellFound2() {
        stock3.sell();
        realty1.sell();
    }
}

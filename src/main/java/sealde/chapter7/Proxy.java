package sealde.chapter7;

/**
 * Created by sealde on 8/4/17.
 */
public class Proxy implements GiveGift {
    private Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl){
        this.pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
        this.pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        this.pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        this.pursuit.giveChocolate();
    }
}

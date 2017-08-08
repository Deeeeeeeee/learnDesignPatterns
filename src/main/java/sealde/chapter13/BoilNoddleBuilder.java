package sealde.chapter13;

/**
 * Created by sealde on 8/9/17.
 * 煮面
 */
public class BoilNoddleBuilder extends NoddleBuilder {
    @Override
    public void addWater() {
        System.out.println("加足够水");
    }

    @Override
    public void addNoddle() {
        System.out.println("加面");
    }

    @Override
    public void addOil() {
        System.out.println("放少量油");
    }

    @Override
    public void addSalt() {
        System.out.println("放盐");
    }
}

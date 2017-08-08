package sealde.chapter13;

/**
 * Created by sealde on 8/9/17.
 * 炒面
 */
public class FryNoddleBuilder extends NoddleBuilder {
    @Override
    public void addWater() {

    }

    @Override
    public void addNoddle() {
        System.out.println("加面");
    }

    @Override
    public void addOil() {
        System.out.println("放多一点油");
    }

    @Override
    public void addSalt() {
        System.out.println("放盐");
    }
}

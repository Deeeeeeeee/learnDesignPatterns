package sealde.chapter13;

/**
 * Created by sealde on 8/9/17.
 */
public class NoddleDirector {
    private NoddleBuilder builder;

    public NoddleDirector(NoddleBuilder noddleBuilder) {
        this.builder = noddleBuilder;
    }

    public void makeNoddle() {
        builder.addWater();
        builder.addNoddle();
        builder.addOil();
        builder.addSalt();
    }
}

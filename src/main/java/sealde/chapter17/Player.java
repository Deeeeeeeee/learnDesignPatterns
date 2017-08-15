package sealde.chapter17;

/**
 * Created by sealde on 8/16/17.
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();
}

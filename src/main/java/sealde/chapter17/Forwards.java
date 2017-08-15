package sealde.chapter17;

/**
 * Created by sealde on 8/16/17.
 */
public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋" + this.name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋" + this.name + "防守");
    }
}

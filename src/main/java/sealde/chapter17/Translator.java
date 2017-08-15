package sealde.chapter17;

/**
 * Created by sealde on 8/16/17.
 */
public class Translator extends Player {
    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        foreignCenter.jingGong();
    }

    @Override
    public void defense() {
        foreignCenter.fangShou();
    }
}

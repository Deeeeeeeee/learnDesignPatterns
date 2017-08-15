package sealde.chapter17;

/**
 * Created by sealde on 8/16/17.
 */
public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jingGong() {
        System.out.println("外籍中锋" + this.name + "进攻");
    }

    public void fangShou() {
        System.out.println("外籍中锋" + this.name + "防守");
    }
}

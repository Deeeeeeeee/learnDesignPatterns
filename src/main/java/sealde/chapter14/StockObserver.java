package sealde.chapter14;

/**
 * 看股票的同事
 * Created by sealde on 8/13/17.
 */
public class StockObserver extends Observer {
    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    void update() {
        System.out.println(subject.getSubjectState() + this.name
                + "关闭股票行情，继续工作！");
    }
}

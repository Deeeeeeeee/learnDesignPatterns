package sealde.chapter14;

/**
 * Created by sealde on 8/13/17.
 */
public class NBAObserver extends Observer {
    public NBAObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    void update() {
        System.out.println(subject.getSubjectState() + this.name
                + "关闭股票行情，继续工作！");
    }
}

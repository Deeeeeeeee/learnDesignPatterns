package sealde.chapter24;

/**
 * Created by sealde on 8/18/17.
 */
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getRequestType())) {
            System.out.println(this.name + ":" + request.getRequestContent() +
                    "数量" + request.getNumber() + "被批准");
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 500) {
            System.out.println(this.name + ":" + request.getRequestContent() +
                    "数量" + request.getNumber() + "被批准");
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 500) {
            System.out.println(this.name + ":" + request.getRequestContent() +
                    "数量" + request.getNumber() + "再说吧");
        }
    }
}

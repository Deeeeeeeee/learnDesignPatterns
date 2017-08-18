package sealde.chapter24;

import org.junit.Test;

/**
 * Created by sealde on 8/18/17.
 */
public class ChainOfResponsibilityPatternTest {
    @Test
    public void ChainOfResponsibilityTest() {
        CommonManager jinli = new CommonManager("金利");
        Majordomo zongjian = new Majordomo("宗剑");
        GeneralManager zhongjingli = new GeneralManager("钟精励");
        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zhongjingli);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(1);
        jinli.requestApplications(request);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(4);
        jinli.requestApplications(request2);

        Request request3 = new Request();
        request3.setRequestType("请假");
        request3.setRequestContent("小菜请求加薪");
        request3.setNumber(500);
        jinli.requestApplications(request3);

        Request request4 = new Request();
        request4.setRequestType("请假");
        request4.setRequestContent("小菜请求加薪");
        request4.setNumber(1000);
        jinli.requestApplications(request4);
    }
}

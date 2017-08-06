package sealde.chapter10;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sealde on 8/6/17.
 */
public class TemplateMethodPatternTest {
    private static final Logger logger = LoggerFactory.getLogger(TemplateMethodPatternTest.class);

    @Test
    public void templateMethodTest() {
        logger.info("学生A抄的试卷：");
        TestPaper testPaperA = new TestPaperA();
        testPaperA.testQuestion1();
        testPaperA.testQuestion2();
        testPaperA.testQuestion3();

        logger.info("学生A抄的试卷：");
        TestPaper testPaperB = new TestPaperB();
        testPaperB.testQuestion1();
        testPaperB.testQuestion2();
        testPaperB.testQuestion3();
    }
}

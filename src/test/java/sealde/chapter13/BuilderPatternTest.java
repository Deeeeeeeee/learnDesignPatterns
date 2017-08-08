package sealde.chapter13;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sealde on 8/9/17.
 */
public class BuilderPatternTest {
    private static final Logger logger = LoggerFactory.getLogger(BuilderPatternTest.class);

    @Test
    public void builderFryTest() {
        logger.info("炒面");

        NoddleDirector director = new NoddleDirector(new FryNoddleBuilder());
        director.makeNoddle();
    }

    @Test
    public void builderBoilTest() {
        logger.info("煮面");

        NoddleDirector director = new NoddleDirector(new BoilNoddleBuilder());
        director.makeNoddle();
    }
}

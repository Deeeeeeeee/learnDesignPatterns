package sealde.chapter18;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sealde on 8/16/17.
 */
public class MemoPatternTest {
    private static final Logger logger = LoggerFactory.getLogger(MemoPatternTest.class);

    @Test
    public void memoTest() {
        logger.info("大战boss前");
        GameRole role = new GameRole();
        role.getInitState();
        role.stateDisplay();

        logger.info("保存进度");
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleStateMemento(role.saveState());

        logger.info("大战boss后");
        role.fight();
        role.stateDisplay();

        logger.info("恢复之前的状态");
        role.recoveryState(caretaker.getRoleStateMemento());
        role.stateDisplay();
    }
}

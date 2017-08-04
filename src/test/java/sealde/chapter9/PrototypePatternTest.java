package sealde.chapter9;

import org.junit.Test;

/**
 * Created by sealde on 8/5/17.
 */
public class PrototypePatternTest {
    @Test
    public void prototypeTest() throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "XX公司");

        Resume b = (Resume)a.clone();
        b.setWorkExperience("1998-2006", "YY企业");

        Resume c = (Resume)a.clone();
        c.setWorkExperience("1998-2003", "ZZ企业");

        a.display();
        b.display();
        c.display();
    }
}

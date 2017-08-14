package sealde.chapter15;

import org.junit.Test;

/**
 * Created by seal_de on 2017/8/14.
 */
public class AbstractFactoryPatternTest {
    @Test
    public void abstractFactoryTest() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        User user = new User();
        Department dept = new Department();

        IUser iUser = DataAccess.createUser();

        iUser.insert(user);
        iUser.getUser("1");

        IDepartment iDepartment = DataAccess.createDepartment();

        iDepartment.insert(dept);
        iDepartment.getDepartment("1");
    }
}

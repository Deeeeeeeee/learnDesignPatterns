package sealde.chapter15;

/**
 * Created by seal_de on 2017/8/14.
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在SqlServer中给Department表增加一条记录");
    }

    @Override
    public Department getDepartment(String id) {
        System.out.println("在SqlServer中根据ID得到Department表一条记录");
        return null;
    }
}

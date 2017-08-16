package sealde.chapter19;

/**
 * Created by seal_de on 2017/8/16.
 */
public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {}

    @Override
    public void remove(Company company) {}

    @Override
    public void display(int dept) {
        System.out.println(this.createSeparators(dept) + this.name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.name + "员工招聘培训管理");
    }
}

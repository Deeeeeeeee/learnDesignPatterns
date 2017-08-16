package sealde.chapter19;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sealde on 8/16/17.
 */
public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int dept) {
        System.out.println(this.name);
        for (Company company : children) {
            company.display(dept +2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : children) {
            company.lineOfDuty();
        }
    }
}

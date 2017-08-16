package sealde.chapter19;

/**
 * Created by sealde on 8/16/17.
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);
    public abstract void remove(Company company);
    public abstract void display(int dept);
    public abstract void lineOfDuty();
}

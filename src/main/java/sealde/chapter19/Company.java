package sealde.chapter19;

/**
 * Created by sealde on 8/16/17.
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public static String createSeparators(int dept) {
        char[] cs = new char[dept];
        for (int i = 0; i < cs.length; i++)
            cs[i] = '-';
        return new String(cs);
    }

    public abstract void add(Company company);
    public abstract void remove(Company company);
    public abstract void display(int dept);
    public abstract void lineOfDuty();
}

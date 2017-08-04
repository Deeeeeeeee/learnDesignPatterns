package sealde.chapter9;

/**
 * Created by sealde on 8/4/17.
 */
public class WorkExperience implements Cloneable {
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public WorkExperience clone() throws CloneNotSupportedException {
        return (WorkExperience) super.clone();
    }
}

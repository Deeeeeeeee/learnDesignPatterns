package sealde.chapter9;

/**
 * Created by sealde on 8/4/17.
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;

    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company) {
        this.workExperience.setWorkDate(workDate);
        this.workExperience.setCompany(company);
    }

    public void display() {
        System.out.println(this.name + " " + this.sex + ""
                + this.age);
        System.out.println("工作经历： " + this.workExperience.getWorkDate()
                + this.workExperience.getCompany());
    }

    @Override
    public Resume clone() throws CloneNotSupportedException {
        Resume cloned = (Resume) super.clone();
        cloned.workExperience = workExperience.clone();
        return cloned;
    }
}

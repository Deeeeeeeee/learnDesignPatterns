package sealde.chapter6;

/**
 * Created by sealde on 8/3/17.
 */
public abstract class Person {
    private String name;

    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.print("装扮的" + this.name);
    }
}

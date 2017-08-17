package sealde.chapter21;

/**
 * 饿汉
 * Created by sealde on 8/17/17.
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    private Singleton1() {}
    public static Singleton1 getInstance() {
        return instance;
    }
}

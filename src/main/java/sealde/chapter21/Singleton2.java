package sealde.chapter21;

/**
 * 静态内部类
 * Created by sealde on 8/17/17.
 */
public class Singleton2 {
    private Singleton2() {}
    public static final Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }
    private static class SingletonHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }
}

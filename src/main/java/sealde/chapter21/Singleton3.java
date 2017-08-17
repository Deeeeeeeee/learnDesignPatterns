package sealde.chapter21;

/**
 * 双重校验锁
 * Created by sealde on 8/17/17.
 */
public class Singleton3 {
    //volatile 关键字可以阻止 java 指令重排优化
    //防止了将分配好的内存地址赋值给 instance 和 Singleton3 初始化指令重排造成的错误
    private volatile static Singleton3 instance;
    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}

package sealde.chapter22;

/**
 * Created by sealde on 8/18/17.
 */
public abstract class HandsetBrand {
    protected HandsetSoft soft;

    public void setHandsetSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
}

package sealde.chapter21;

/**
 * Created by sealde on 8/17/17.
 */
public enum Singleton4 {
    Singleton4("单例的枚举方式");
    private String str;
    private Singleton4(String str){
        this.setStr(str);
    }
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }

}

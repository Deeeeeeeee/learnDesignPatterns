package sealde.chapter15;

/**
 * Created by seal_de on 2017/8/14.
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在Access中给User表增加一条记录");
    }

    @Override
    public User getUser(String id) {
        System.out.println("在Access中根据ID得到User表一条记录");
        return null;
    }
}

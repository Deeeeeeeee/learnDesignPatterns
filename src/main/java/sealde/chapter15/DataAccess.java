package sealde.chapter15;

import java.io.*;
import java.util.Properties;

/**
 * Created by seal_de on 2017/8/14.
 */
public class DataAccess {
    private static String db = "";
    private static final String propertiesPath = System.getProperty("user.dir") + "/src/main/java/sealde/chapter15/db.properties";
    static {
        try {
            InputStream is = new FileInputStream(propertiesPath);
            Properties p = new Properties();
            p.load(is);
            db = p.getProperty("db.name");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static IUser createUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "sealde.chapter15." + db + "User";
        Class clazz = Class.forName(className);
        return (IUser) clazz.newInstance();
    }

    public static IDepartment createDepartment() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "sealde.chapter15." + db + "Department";
        Class clazz = Class.forName(className);
        return (IDepartment) clazz.newInstance();
    }
}

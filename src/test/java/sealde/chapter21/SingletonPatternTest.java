package sealde.chapter21;

import org.junit.Assert;
import org.junit.Test;
import sealde.chapter21.Singleton1;
import sealde.chapter21.Singleton2;
import sealde.chapter21.Singleton3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by sealde on 8/17/17.
 */
public class SingletonPatternTest {
    @Test
    public void singletonTest() {
        Singleton1 s11 = Singleton1.getInstance();
        Singleton1 s12 = Singleton1.getInstance();
        Assert.assertEquals(s11.hashCode(), s12.hashCode());

        Singleton2 s21 = Singleton2.getInstance();
        Singleton2 s22 = Singleton2.getInstance();
        Assert.assertEquals(s21.hashCode(), s22.hashCode());

        Singleton3 s31 = Singleton3.getInstance();
        Singleton3 s32 = Singleton3.getInstance();
        Assert.assertEquals(s31.hashCode(), s32.hashCode());
    }

    @Test
    public void testReflect() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton3 s  = Singleton3.getInstance();
        Class c = Singleton3.class;
        Constructor privateConstructor;
        privateConstructor = c.getDeclaredConstructor();
        privateConstructor.setAccessible(true);
        Singleton3 ss = (Singleton3)privateConstructor.newInstance();
        Assert.assertEquals(s.hashCode(), ss.hashCode());

    }
}

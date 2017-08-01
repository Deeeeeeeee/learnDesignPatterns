package sealde.chapter1;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by sealde on 8/1/17.
 */
public class OperationFactoryTest {
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void testOperationAdd() {
        Operation oper = OperationFactory.createOperation("+");
        oper.setNumberA(10.1);
        oper.setNumberB(5.3);
        double result = oper.getResult();
        Assert.assertEquals(15.4, result, 0.0000001);
    }

    @Test
    public void testOperationSub() {
        Operation oper = OperationFactory.createOperation("-");
        oper.setNumberA(10.1);
        oper.setNumberB(5.3);
        double result = oper.getResult();
        Assert.assertEquals(4.8, result, 0.0000001);
    }

    @Test
    public void testOperationMul() {
        Operation oper = OperationFactory.createOperation("*");
        oper.setNumberA(10.1);
        oper.setNumberB(5.3);
        double result = oper.getResult();
        Assert.assertEquals(53.53, result, 0.0000001);
    }

    @Test
    public void testOperationDiv() {
        Operation oper = OperationFactory.createOperation("/");
        oper.setNumberA(10.1);
        oper.setNumberB(5.3);
        double result = oper.getResult();
        Assert.assertEquals(1.90566038, result, 0.0000001);
    }

    @Test
    public void testOperationDivException() {
        Operation oper = OperationFactory.createOperation("/");
        oper.setNumberA(10.1);
        oper.setNumberB(0.0);
        expectedEx.expect(RuntimeException.class);
        expectedEx.expectMessage("被除数不能为0");
        double result = oper.getResult();
    }
}

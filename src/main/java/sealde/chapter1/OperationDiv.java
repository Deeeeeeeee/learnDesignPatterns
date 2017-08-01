package sealde.chapter1;

/**
 * Created by sealde on 8/1/17.
 */
public class OperationDiv extends Operation {
    @Override
    double getResult() {
        if(this.numberB == 0)
            throw new RuntimeException("被除数不能为0");
        return this.numberA / this.numberB;
    }
}

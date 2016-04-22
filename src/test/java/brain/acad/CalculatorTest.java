package brain.acad;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by m18 on 22.04.2016.
 */
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        Assert.assertEquals(5, result);
    }


    @Test
    @Ignore
    public void testAdd2() throws Exception {
        int result = calculator.add(-3,2);
        Assert.assertEquals(5,result);
    }
}
import org.junit.Assert;
import org.junit.Test;

public class SumTest {


    @Test
    public void sumWorksOrNot() {
        Main SumTest = new Main();
        SumTest.elements(3);
        SumTest.elements(4);
        Assert.assertEquals(7, SumTest.sumMethod());
    }
}
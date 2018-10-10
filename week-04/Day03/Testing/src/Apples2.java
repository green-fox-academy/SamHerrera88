import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Apples2 {
    @Test
    public void getApple() {
        Apples apple = new Apples();
        assertEquals("apple", apple.getApple());
    }
}

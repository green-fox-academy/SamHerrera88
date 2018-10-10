import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class CountTest {

    @Test
    public void countLetters(){
        CountLetters testmap = new CountLetters();
        testmap.countLetters("Sambo");
        assertTrue(testmap.countLetters("Sambo") != null);
    }
}

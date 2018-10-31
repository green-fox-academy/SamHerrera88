import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    Anagram anagramObject = new Anagram();

    @Test
    public void anagram() {
        String string1 = "Astro";
        String string2 = "Rotas";
        assertEquals(false, Anagram.anagram(string1, string2));
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FindMaxTest {

    @Test
    void find() {
        String myString = "welcome";
        String expect = "welo";
        String result = FindMax.find(myString);
        assertEquals(expect, result);
    }

    @Test
    void find1() {
        String myString = "HelloImLongAHandsomeMan";
        String expect = "gAHans";
        String result = FindMax.find(myString);
        assertEquals(expect, result);
    }
}
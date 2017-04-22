import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by jakubinyi on 2017.04.22..
 */
public class FileWorldAnalyzerTest {


    @Test
    public void testWordsByABC() throws IOException {
        FileWorldAnalyzer fWA = new FileWorldAnalyzer(new FilePartReader("src/test.txt", 1, 1));

        ArrayList<String> result = new ArrayList<>(Arrays.asList("bence", "cica", "Dani"));

        assertEquals(fWA.wordsByABC(), result);
    }


    @Test
    public void testWordsContainingSubString() throws IOException {
        FileWorldAnalyzer fWA = new FileWorldAnalyzer(new FilePartReader("src/test.txt", 1, 1));

        ArrayList<String> result = new ArrayList<>(Arrays.asList("Dani"));

        assertEquals(fWA.wordsContainingSubString("da"), result);
    }

}

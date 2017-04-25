package test;

import main.FilePartReader;
import main.FileWorldAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by jakubinyi on 2017.04.22..
 */
public class FileWorldAnalyzerTest {


    @Test
    public void testWordsByABC() throws IOException {
        FileWorldAnalyzer fWA = new FileWorldAnalyzer(new FilePartReader("src/test.txt", 1, 1));

        ArrayList<String> result = new ArrayList<>(Arrays.asList("bence", "cica", "Dani"));

        Assertions.assertEquals(fWA.wordsByABC(), result);
    }


    @Test
    public void testWordsContainingSubString() throws IOException {
        FileWorldAnalyzer fWA = new FileWorldAnalyzer(new FilePartReader("src/test.txt", 1, 1));

        ArrayList<String> result = new ArrayList<>(Arrays.asList("Dani"));

        Assertions.assertEquals(fWA.wordsContainingSubString("da"), result);
    }

}

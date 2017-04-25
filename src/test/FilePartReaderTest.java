package test;

import main.FilePartReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Created by jakubinyi on 2017.04.21..
 */
public class FilePartReaderTest {

    @Test
    public void testValidPath() throws IOException {
        new FilePartReader("src/text.txt", 1, 1);
    }

    /*@Test
    public void testNoSuchFileException() throws IOException {
        assertThrows(java.nio.file.NoSuchFileException.class, () -> {
            new main.FilePartReader("src/tttt.txt", 1, 1);
        });
    }*/

    @Test
    public void testForIllegalArgumentException() throws IOException {
        assertThrows(IllegalArgumentException.class, () -> {
            new FilePartReader("src/text.txt", 0, 1);
        });
    }

   /* @Test
    public void testRead() throws IOException {
        main.FilePartReader fPR = new main.FilePartReader("src/test.txt", 1, 1);
        Method method = main.FilePartReader.class.getDeclaredMethod(read());
        method.setAccessible(true);

        String result = fPR.read();

        assertEquals("alfa Beta cecil\n" +
                "cica bence Dani\n" +
                "c a B\n" +
                "d b a\n" +
                "E f g\n", result);
    }*/

    @Test
    public void testReadLines() throws IOException {
        FilePartReader fPR = new FilePartReader("src/test.txt", 1, 1);
        String result = fPR.readLines();

        assertEquals("cica bence Dani", result);
    }
}

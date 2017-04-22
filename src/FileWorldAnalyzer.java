import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by jakubinyi on 2017.04.21..
 */
public class FileWorldAnalyzer {
    FilePartReader fPR = null;

    public FileWorldAnalyzer(FilePartReader fPR) {
        this.fPR = fPR;
    }

    public ArrayList wordsByABC() throws IOException {
        String input = fPR.readLines();
        ArrayList<String> orderedWords = new ArrayList<>();

        for (String word : input.split(" ")) {
            orderedWords.add(word);
        }

        orderedWords.sort(String::compareToIgnoreCase);

        return orderedWords;
    }

    public ArrayList wordsContainingSubString(String subString) throws IOException {
        String input = fPR.readLines();
        ArrayList<String> wordsWhichContains = new ArrayList<>();

        for (String word : input.split(" ")) {
            if (word.toLowerCase().contains(subString)) {
                wordsWhichContains.add(word);
            }
        }

        return wordsWhichContains;
    }
}

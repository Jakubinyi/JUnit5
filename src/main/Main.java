package main;

import java.io.IOException;

/**
 * Created by jakubinyi on 2017.04.21..
 */
public class Main {


        public static void main(String[] args) throws IOException {
        FilePartReader fPR = new FilePartReader("src/test.txt", 1, 1);
        FileWorldAnalyzer fWA = new FileWorldAnalyzer(fPR);

        System.out.println(fPR.readLines());
        System.out.println(fWA.wordsByABC());
        System.out.println(fWA.wordsContainingSubString("da"));
    }
}

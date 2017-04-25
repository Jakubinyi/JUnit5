package main;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubinyi on 2017.04.21..
 */
public class FilePartReader {
    private String filePath;
    private Integer fromLine;
    private Integer toLine;

    public FilePartReader(String filePath, Integer fromLine, Integer toLine) throws IllegalArgumentException {
        if (toLine < fromLine || fromLine < 1) {
            throw new IllegalArgumentException();
        }
        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;
    }

    private String read() throws IOException {
        String result = "";
        List<String> lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);

        for (String line : lines) {
            result += line  + "\n";
        }
        return result;
    }

    public String readLines() throws IOException {
        String selectedLines = "";
        String input = read();
        String[] inputLines = input.split("\n");

        for (int i = 0; i < inputLines.length; i++) {
            if (i >= fromLine && i<= toLine) {
                selectedLines += inputLines[i].trim();
            }
        }
        return selectedLines;
    }
}

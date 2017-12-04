package ru.itis;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Arrays;

public class Dictionary {
    String[] words;
    int size = 0;

    public void printDict() {
        for (String string : words) {
            System.out.println(string);
        }
    }

    public void readDict() throws Exception {
        LineNumberReader reader = new LineNumberReader(new FileReader("dictionary.txt"));
        String line;
        words = new String[5];
        while ((line = reader.readLine()) != null) {
            if ((words.length - size) < 2) words = Arrays.copyOf(words, size + 100);
            words[size] = line;
            size++;
        }
        words = Arrays.copyOf(words, size);
    }
}

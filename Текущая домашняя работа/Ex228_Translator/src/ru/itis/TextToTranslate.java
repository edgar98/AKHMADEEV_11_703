package ru.itis;

import java.io.FileReader;
import java.io.LineNumberReader;

public class TextToTranslate {
    String text;
    String translatedText;

    public void printInput() {
        System.out.println(text);
    }

    public void readText() throws Exception {
        LineNumberReader reader = new LineNumberReader(new FileReader("Text.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            text = line;
        }
    }

    public void Translate(Dictionary dictionary) {
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = findInDictionary(dictionary, arr[i]);
        }
        translatedText = stringArrToString(arr);
    }

    private String stringArrToString(String[] arr) {
        String result = "";
        for (String string : arr) {
            result += string + " ";
        }
        result += ".";
        return result;
    }

    private String findInDictionary(Dictionary dictionary, String s) {
        for (int i = 0; i < dictionary.words.length; i++) {
            String[] dictionaryLine = dictionary.words[i].split(" = ");
            if (s.equals(dictionaryLine[0])) {
                return (dictionaryLine[1]);
            }
        }
        return s;
    }

    public void printOutput() {
        System.out.println(translatedText);
    }
}

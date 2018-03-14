package ru.itis;

import java.io.*;

public class TextToTranslate {
    String text;
    String translatedText;

    public TextToTranslate() {
        this.text = "";
    }

    public void printInput() {
        System.out.println(text);
    }

    public void readText() throws Exception {
        FileReader fileReader = new FileReader("Text.txt");
        LineNumberReader reader = new LineNumberReader(fileReader);
        String line;
        while ((line = reader.readLine()) != null) {
            text += line;
        }
        fileReader.close();
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
        // добавить s в файл dictionary
        addWordToDictionary(s);
        return s;
    }

    private void addWordToDictionary(String s) {
        File file = new File("dictionary.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            fileWriter.write("\n" + s + " = *");

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void printOutput() {
        System.out.println("\n" + translatedText);
    }
}

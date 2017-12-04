package ru.itis;

public class Main {

    public static void main(String[] args) throws Exception {
        Dictionary dictionary = new Dictionary();
        dictionary.readDict();
        TextToTranslate text = new TextToTranslate();
        text.readText();
        text.Translate(dictionary);
        text.printInput();
        text.printOutput();
    }
}

package ru.itis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyScanner {
    private FileInputStream fis;
    public MyScanner(String filename) {
        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int nextInt() {
        int currentByte = ' ';
        String out = "";
        try {
            currentByte = fis.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (currentByte == -1) throw new NullPointerException();

        while (currentByte != (int) ' ') {
            out += (char)currentByte;
            try {
                currentByte = fis.read();
                if (currentByte == -1) break;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (out == " " || out == "") throw new NullPointerException();
        return Integer.parseInt(out);
    }
}

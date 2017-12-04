package ru.itis;

public class Ex52 {
    private String string;

    public Ex52(String string) {
        this.string = string;
    }

    public boolean isInclude(Ex52 toComp) {
        int thisLength = this.string.length();
        int toCompLength = toComp.string.length();
        for (int i = 0; (i < toCompLength); i++) {
            if (toComp.string.charAt(i) == this.string.charAt(0)) {
                int equalAmount = 1;
                for (int j = 1; (j < thisLength); j++) {
                    if (this.string.charAt(j) != toComp.string.charAt(i + j)) break;
                    equalAmount++;
                }
                if (equalAmount == thisLength) return true;
            }

        }
        return false;
    }
}
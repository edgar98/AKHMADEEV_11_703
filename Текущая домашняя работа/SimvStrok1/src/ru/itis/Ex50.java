package ru.itis;

class Ex50 {
    private final String string;

    public Ex50(String string) {
        this.string = string;
    }

    public boolean isEqual(Ex50 toCompare) {
        if (this.string.length() != toCompare.string.length()) return false;
        for (int i = 0; i < string.length(); i++) {
            if (this.string.charAt(i) != toCompare.string.charAt(i)) return false;
        }
        return true;
    }
}

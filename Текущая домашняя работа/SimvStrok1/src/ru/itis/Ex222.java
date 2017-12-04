package ru.itis;

class Ex222 {
    private final String string;

    public Ex222(String string) {
        this.string = string;
    }

    public void findWords() {
        String[] strings = string.split(" ");
        System.out.println("Слова-палиндромы в строке: ");
        for (String string1 : strings) {
            if (isPalindrome(string1)) System.out.println(" " + string1);
        }
        System.out.println();
    }

    private boolean isPalindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) return false;
        }
        return true;
    }
}

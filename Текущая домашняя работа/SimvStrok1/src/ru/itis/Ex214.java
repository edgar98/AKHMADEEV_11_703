package ru.itis;

class Ex214 {
    private final String string;

    public Ex214(String string) {
        this.string = string;
    }

    public void findWords() {
        String[] strings = string.split(" ");
        System.out.println("Слова в строке, которые начинаются на одну и ту же букву :");
        for (String string1 : strings) {
            if (string1.charAt(0) == string1.charAt(string1.length() - 1)) System.out.println(" " + string1);
        }
        System.out.println();
    }
}

package ru.itis;

class Ex35 {
    private final String string;

    public Ex35(String input) {
        this.string = input;
    }

    public void minNumberLength() {
        String[] strings = string.split(" ");
        int min = strings[0].length();
        for (String string1 : strings) {
            int minI = string1.length();
            min = (minI < min) ? minI : min;
        }
        System.out.println("Минимальное кол-во цифр в числе строки = " + min);
        System.out.println();
    }
}

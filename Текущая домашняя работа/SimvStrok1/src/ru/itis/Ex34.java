package ru.itis;

class Ex34 {
    private final String string;

    public Ex34(String input) {
        this.string = input;
    }

    public void maxDigit() {
        char max = string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            max = (string.charAt(i) > max) ? string.charAt(i) : max;
        }
        System.out.println("Максимальная цифра числа = " + max);
        System.out.println();
    }
}

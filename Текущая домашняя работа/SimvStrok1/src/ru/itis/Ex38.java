package ru.itis;

class Ex38 {
    private final String string;

    public Ex38(String string) {
        this.string = string;
    }

    public void isDigit() {
        boolean f = false;
        for (int i = 0; (!f) & (i < string.length()); i++) {
            int digit = string.charAt(i) - 48;
            f = (digit / 2 == 0) || (digit / 3 == 0);
        }
        String result = f ? "ИМЕЕТСЯ" : "НЕ ИМЕЕТСЯ";
        System.out.println("В данном числе " + result + " цифра делящаяся на 2 или 3");
        System.out.println();
    }
}

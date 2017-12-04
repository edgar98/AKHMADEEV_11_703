package ru.itis;

class Ex227 {
    private String string;
    private String memory; // ввиду особенностей алгоритма приходится изменять содержимое второго слагаемого,
                           // поэтому его строка сохраняется здесь

    public Ex227(String string) {
        this.string = string;
    }

    public void print() {
        System.out.println(this.string);
    }

    public void add(Ex227 toAdd) {
        /*
            Данный метод является алгоритмом сложения чисел в строках
            1) Выравниваем строки по длине
            2) Идём с конца строк и складываем "столбиком" цифры
            3) В конце прибавляем "единицу в уме", если была
         */

        this.memory = toAdd.string; // сохранение строки слагаемого
        makeEqualByLength(toAdd); // выравнивание длины
        String second = toAdd.string;
        StringBuilder summary = new StringBuilder(); // строка для сохранения результата вычисления
        byte additionalOne = 0; // переменная для хранения "единицы в уме"

        for (int i = this.string.length() - 1; i >= 0; i--) {

            int add = Character.getNumericValue(this.string.charAt(i)) + Character.getNumericValue(second.charAt(i)) + additionalOne;
            additionalOne = 0;
            if (add <= 9) {
                summary.insert(0, add);
            } else {
                add -= 10;
                additionalOne = 1;
                summary.insert(0, add);
            }
        }

        if (additionalOne != 0) summary.insert(0, additionalOne);

        this.string = summary.toString();
        revertChanges(toAdd);
    }

    private void makeEqualByLength(Ex227 toAdd) {
        /*  Этот метод делает строки равными по длине
            для удобства счёта (прим. 1 + 100, алгоритм
            выйдет за пределы первой строки поэтому превращаем её в "001")
         */
        int difference = Math.abs(this.string.length() - toAdd.string.length());
        if (this.string.length() > toAdd.string.length()) {
            for (int i = 0; i < difference; i++) {
                toAdd.string = "0" + toAdd.string;
            }
        } else if (this.string.length() < toAdd.string.length()) {
            for (int i = 0; i < difference; i++) {
                this.string = "0" + this.string;
            }
        }
    }

    private void revertChanges(Ex227 toAdd) {
        // метод возвращает строку второго слагаемого в исходный вид
        toAdd.string = this.memory;
    }
}

package ru.itis;

class Ex226 {
    private String string;

    public Ex226(String string) {
        this.string = string;
    }

    public void sortByAlphabet() {
        String[] strings = string.split(" ");
        bubbleSort(strings);
        string = "";
        for (String str : strings) {
            string += str + " ";
        }
    }

    public void print() {
        System.out.println(string);
        System.out.println();
    }

    private void bubbleSort(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {

            for (int j = 1; j <= i; j++) {

                if (compareWords(arr[j], arr[j -1])) {

                    String t = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = t;

                }
            }
        }
    }

    private boolean compareWords(String first, String second) {
        for (int i = 0; (i < first.length()) & (i < second.length()); i++) {
            if (first.charAt(i) != second.charAt(i)) return (first.charAt(i) < second.charAt(i));
        }
        return true;
    }
}

package ru.itis;

class Main {

    public static void main(String[] args) {

        Ex34 ex34 = new Ex34("87654232157491231");
        ex34.maxDigit();

        Ex35 ex35 = new Ex35("12354 21354 684 521 32189842");
        ex35.minNumberLength();

        Ex38 ex38 = new Ex38("213549846231867652413573421684");
        ex38.isDigit();

        Ex50 string1 = new Ex50("Test string!!!");
        Ex50 string2 = new Ex50("Test string!!!");
        Ex50 string3 = new Ex50("Test string!!");
        System.out.println("Строка 1 равна Строке 2 = " + string1.isEqual(string2));
        System.out.println("Строка 1 равна Строке 3 = " + string1.isEqual(string3));
        System.out.println();

        Ex52 string_1 = new Ex52("cat");
        Ex52 string_2 = new Ex52("kjshdflisunddliasuhdljaskhdlsjdacatsldkjhsdflsdgfsldjhdgdhjdfs");
        System.out.println("Строка_1 входит в Строку_2 = " + string_1.isInclude(string_2));
        System.out.println();


        Ex214 ex214 = new Ex214("sins 123451 мойм дфыль 21354321 klassdv");
        ex214.findWords();

        Ex222 ex222 = new Ex222("12321 asdfghjklkjhgfdsa йцукенекуцй ыфвпфвып saxsfdfg 53218675 арозаупаланалапуазора");
        ex222.findWords();

        Ex226 ex226 = new Ex226("copper explain ill-fated truck neat unite branch educated tenuous hum decisive notice");
        ex226.sortByAlphabet();
        ex226.print();

        Ex227 first = new Ex227("9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"); // тут 100 девяток, на выходе 100 нулей
        Ex227 second = new Ex227("1");
        first.add(second);
        first.print();


    }
}

package ru.itis;

public class Main {

    public static void main(String[] args) {
        String input = "x1:=123;x2:=5;x3:=x2+22;x4:=x2+x3;x5:=x1-23;x6:=21/4;x7:=x1+x2*5;x2:=1;";
        Compiler compiler = new Compiler();
        compiler.analyze(input);
        compiler.process(input).show();
    }
}

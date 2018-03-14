package ru.itis;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

public class Compiler {
    private ArrayList<Variable> list;
    private byte[][] a;
    private byte finalState, initialState, errorState;

    public Compiler(byte[][] a) {
        this.a = a;
    }

    public Compiler() {
        finalState = initialState = 0;
        errorState = 8;
        a = new byte[][]{
                {1, 8, 8, 8, 8, 8, 8},
                {8, 2, 8, 8, 8, 8, 8},
                {8, 8, 3, 8, 8, 8, 8},
                {8, 8, 8, 4, 8, 8, 8},
                {5, 7, 8, 8, 8, 8, 8},
                {8, 6, 8, 8, 8, 8, 8},
                {8, 8, 8, 8, 0, 4, 8},
                {8, 7, 8, 8, 0, 4, 8},
                {8, 8, 8, 8, 8, 8, 8},
        };
    }

    public void analyze(String input) {
        int state = initialState;
        for (int i = 0; i < input.length(); i++) {
            state = a[state][charToIntDescriptor(input.charAt(i))];
            if (state == errorState) throw new SyntaxException("");
        }
        if (state != finalState) throw new SyntaxException("АЩИПКА!!!");
    }

    private int charToIntDescriptor(char ch) {
        if (Character.isLetter(ch)) {
            return 0;
        } else if (Character.isDigit(ch)) {
            return 1;
        } else if (ch == ':') {
            return 2;
        } else if (ch == '=') {
            return 3;
        } else if (ch == ';') {
            return 4;
        } else if ((ch == '+') || (ch == '-') || (ch == '*') || (ch == '/')) {
            return 5;
        }
        return 6;
    }

    public List<Variable> process(String input) {
        String[] inputSplit = input.split(";");
        list = new ArrayList<>();
        for (String command : inputSplit) {
            list.add(processSingleCommand(command));

        }
        return list;
    }
    

    private Variable processSingleCommand(String input) {
        String[] commandParts = input.split(":=");
        String varName = commandParts[0];
        float value = getValue(commandParts[1]);
        return new Variable(varName, value);
    }

    private float getValue(String input) {
        float value = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentMathOperation = '+';
            if ((input.charAt(i) == '/') || (input.charAt(i) == '*') || (input.charAt(i) == '-') || (input.charAt(i) == '+')) {
                currentMathOperation = input.charAt(i++);
            }
            if (Character.isLetter(input.charAt(i))) {
                value = doMath(value, getVariableValue(input.charAt(i++) + "" + input.charAt(i)), currentMathOperation);
            } else {
                StringBuilder number = new StringBuilder();
                while ((i < input.length()) && Character.isDigit(input.charAt(i))) {
                    number.append(input.charAt(i++));
                }
                i--;
                value = doMath(value, Integer.parseInt(number.toString()), currentMathOperation);
            }

        }
        return value;
    }

    private float doMath(float firstPart, Number secondPart, char mathOperation) {
        switch (mathOperation) {
            case '-':
                return firstPart - secondPart.floatValue();
            case '*':
                return firstPart * secondPart.floatValue();
            case '/':
                return firstPart / secondPart.floatValue();
            default:
            case '+':
                return firstPart + secondPart.floatValue();
        }
    }

    private float getVariableValue(String name) {
        int indexOfSomeVar = list.indexOf(new Variable(name, 0));
        if (indexOfSomeVar == -1)
            throw new IllegalArgumentException("Trying to process non initialized variable: " + name);
        else return list.get(indexOfSomeVar).getValue().floatValue();
    }
}

package ru.itis;

public class Variable {
    private String name;
    private Number value;

    public Variable(String name, Number value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        if (obj == this) return true;
        Variable variable = (Variable) obj;
        return (variable.name.equals(this.name));
    }

    @Override
    public String toString() {
        return name + " = " + value;
    }
}

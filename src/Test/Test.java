package Test;

import Calculator.Calculator;

import java.util.Objects;

public class Test {
    public int id;

    public Test(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return id == test.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public static void main(String[] args) {
        System.out.println(calculator(5, 1, 2, 3));
    }

    public static int calculator(int a, int b) {
        return a + b;
    }

    public static int calculator(int a, int b, int c) {
        return calculator(calculator(a, b), c);
    }

    public static int calculator(int a, int b, int c, int x) {
        int ab = calculator(a, b);
        int cx = calculator(c, x);
        return calculator(ab, cx);
    }

}


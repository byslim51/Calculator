package Test;

public class Test4 {
    public static int count(int a) {
        int x = 0;
        if (a > 0) {
            System.out.println(a);
            x = count(a - 1);
        }
        return x;
    }

    public static void main(String[] args) {

        System.out.println(count(5));
    }
    }



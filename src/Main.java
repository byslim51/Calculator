import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Приветствую, введите ваше 1 число:");
        int num1 = scan.nextInt();
        System.out.print("Введите ваше 2 число:");
        int num2 = scan.nextInt();
        System.out.print("Введите действие (* , / , + , -):");
        String trash = scan.nextLine();
        String action2 = scan.nextLine();
        switch (action2) {

            case "+":
                int resAdd = add(num1, num2);
                printNum(resAdd);
                break;

            case "-":
                int resMinus = minus(num1, num2);
                printNum(resMinus);
                break;

            case "*":
                int resMultiply = multiply(num1, num2);
                printNum(resMultiply);
                break;

            case "/":
                int resDivide = divide(num1, num2);
                printNum(resDivide);
                break;

            default:
                System.out.println("Вы ввели что то неправильно");
        }
    }

    public static int add(int num1, int num2) {
        int result = (num1 + num2);
        return result;

    }

    public static int minus(int num1, int num2) {
        int result = (num1 - num2);
        return result;
    }

    public static int multiply(int num1, int num2) {
        int result = (num1 * num2);
        return result;
    }

    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Вы ввели недопустимое число");
            return 0;
        }
        int result = (num1 / num2);
        return result;
    }

    public static void printNum(int result) {
        System.out.println("Итог: " + result);
    }

}


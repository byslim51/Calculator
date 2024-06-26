package Calculator;

import java.util.Scanner;

public class Calculator {
    public void mineCalculator() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int num1 = scan.nextInt();

        System.out.print("Введите второе число:");
        int num2 = scan.nextInt();

        int res;

        System.out.print("Введите действие:");
        String action = scan.next();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.print("Итог:" + res);
                break;

            case "-":
                res = num1 - num2;
                System.out.print("Итог:" + res);
                break;

            case "*":
                res = num1 * num2;
                System.out.print("Итог:" + res);
                break;

            case "/":
                if(num2==0)
                    System.out.print("Error");
                else if (num2==1) {
                    
                } else {
                    res = num1 / num2;
                    System.out.print("Итог:" + res);
                }
                break;
            default:
                System.out.print("Вы ввели что то неправильное.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int num1 = scan.nextInt();

        System.out.print("Введите второе число:");
        int num2 = scan.nextInt();

        int res;

        System.out.print("Введите действие:");
        String action = scan.next();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.print("Итог:" + res);
                break;

            case "-":
                res = num1 - num2;
                System.out.print("Итог:" + res);
                break;

            case "*":
                res = num1 * num2;
                System.out.print("Итог:" + res);
                break;

            case "/":
                if(num2==0)
                    System.out.print("Error");
                else {
                    res = num1 / num2;
                    System.out.print("Итог:" + res);
                }
                break;
            default:
                System.out.print("Вы ввели что то неправильное.");
        }
    }
}


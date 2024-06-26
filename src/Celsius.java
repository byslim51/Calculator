import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите температуру по фаренгейту:");
        double  farn = scan.nextDouble();
        double cels = (farn-32)*5/9;
        System.out.print("Ваша температура по цельсию:"+ cels);
    }
}
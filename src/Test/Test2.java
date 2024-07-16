package Test;

public class Test2 {
    public static void main(String[] args) {
        String[] array1 = {"2", "3", "6"};
        for (int i = 0; i < array1.length; i++) {
            array1[i] = "1";
            System.out.println(array1[i]);
        }

        for (String array : array1) {
//            System.out.println(array);

        }
        for (String array : array1) {
            System.out.println(array);
        }
    }
}

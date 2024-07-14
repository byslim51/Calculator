package Test;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = a + b;
        List<Integer> array = translateToTwo(c, new ArrayList<>());
        for (Object number : array) {
            System.out.println(number);
        }

    }

    public static List<Integer> translateToTwo(double result, List<Integer> array) {
        double x = 1;
        while (result > 0) {
            x = Math.floor(result/2);

            if (x * 2 == result) {
                array.add (0);
                return translateToTwo(x, array);
            }if (x * 2 != result) {
                array.add (1);
                return translateToTwo(x, array);
            }

        }
        List<Integer> newArray = new ArrayList<>();
        int lastNum = array.get(array.size() - 1);
        int lastNum2 = array.get(array.size() - 2);
        int lastNum3 = array.get(array.size() - 3);
        newArray.add (lastNum);
        newArray.add (lastNum2);
        newArray.add (lastNum3);

        return newArray;
    }
}


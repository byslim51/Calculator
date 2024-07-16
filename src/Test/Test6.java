package Test;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int ab = a + b;
        int zeroOne;
        List<Integer> result = new ArrayList<>();

        while (ab > 0) {
            Integer.toBinaryString(ab);
//            zeroOne = ab % 2;
//            result.add(zeroOne);
//            ab = ab / 2;
        }
        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i));
        }
    }
}

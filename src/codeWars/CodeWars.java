package codeWars;

import java.util.ArrayList;
import java.util.List;

public class CodeWars {
    public static int[] map(int[] arr) {
        if (arr == null || arr.length == 0){
            return null;
        }

     int[] resultArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            resultArray[i] = arr[i] + arr[i];
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] arrays = {3,4,5,6};
        System.out.println(map(arrays));
    }
}

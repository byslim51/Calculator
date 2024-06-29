package Array;

public class SimpleArray {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 4;
        arr[2] = 2;
        System.out.println(arr[0] + arr[2]);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                System.out.println(arr[i]);
            }
        }
        String[][] arr2 = new String[8][8];
        for (int i=0 ; i<arr2.length ; i++){
            for (int i2=0 ; i2<arr2[i].length ; i2++){
                if (i2 % 2 == 0){
                    arr2[i][i2] = "W ";
                } else {
                    arr2[i][i2] = "B ";
                }
            }
        }
       for (int i=0 ; i<arr2.length ; i++){
           for (int i2=0  ; i2<arr2[i].length ; i2++){
              System.out.print(arr2[i][i2]);

           }
           System.out.println();
       }

    }
}

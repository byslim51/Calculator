package Array;

public class BinaryArray {
    public static void main(String[] args) {
        chessBoard();
    }

    public static void chessBoard() {
        String[][] arr2 = new String[8][8];
        for (int i = 0; i < arr2.length; i++) {
            for (int i2 = 0; i2 < arr2[i].length; i2++) {
                if ((i + i2) % 2 == 0) {
                    arr2[i][i2] = "W ";
                } else {
                    arr2[i][i2] = "B ";
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int i2 = 0; i2 < arr2[i].length; i2++) {
                System.out.print(arr2[i][i2]);

            }
            System.out.println();
        }

    }
}

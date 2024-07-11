package Test;

public class Test4 {
  public static int square (int x1, int x2){
      if (x2 == 0){
          return 1;
      } else {
          return x1 * square(x1, x2 - 1);
      }

  }

    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        System.out.println(square(a,b));
    }
}



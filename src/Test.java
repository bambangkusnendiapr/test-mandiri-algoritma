import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int qty = input.nextInt();
    prima(qty);

    matrix();
  }

  public static void prima(int qty) {
    int loop = 0;
    for (int i = 1; true; i++) {
      if (i % 2 != 0 && i % 3 != 0) {
        System.out.print(i + " ");
        loop++;
      }

      if (loop == qty) {
        break;
      }
    }
  }

  public static void matrix() {
    int[][] matrix = {
            {3,5,7},
            {8,2,1},
            {6,9,2}
    };

    for (int i = 0; i < matrix.length; i++) {
      int sum = 0;
      for (int j = 0; j < matrix[i].length; j++) {
        sum += matrix[i][j];
      }
      System.out.println(sum);
    }
  }

  public static void balikMatrix() {
    int[][] matrix = {
            {2,6,9},
            {1,5,8},
            {7,2,7}
    };

  }
}

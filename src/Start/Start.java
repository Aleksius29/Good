package Start;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = scanner.nextInt ();
      switch (result) {
          case -1:
              System.out.print("Result is -1");
              break;
          case 0:
              System.out.print("Result is 0");
              break;
          default:
              System.out.print("Result is unknown!");
         }
    }
}


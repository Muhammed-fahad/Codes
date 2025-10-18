import java.util.Scanner;

public class print_dig {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.err.print("Enter a number: ");
    int n = s.nextInt();

    while (n < 0) {
      int v = n%10;
      System.out.println(v);
      n = n/10;
    }
    s.close();
   }
}

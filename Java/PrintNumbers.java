import java.util.Scanner;
public class PrintNumbers {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    s.close();
    int k = 1;
    while (k <= n) {
      System.out.println(k);
      k++;
    }
  }
}
import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
    Scanner s  = new Scanner(System.in);
    int n = s.nextInt();
    int sum = 1;
    s.close();
    while (n>0) {
      sum = sum * n%10;
      n/=10;
    }
    System.out.println(sum);
  }
}

import java.util.Scanner;

public class count {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a value: ");
    int n = s.nextInt();
    int count = 0;
    while (n>0) {
      count++;
      n/=10;
    }
    System.out.println(count);
    s.close();
  }
}


import java.util.Scanner;

public class Grade {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    char a = s.nextLine().charAt(0);
    char x = Character.toUpperCase(a);
    s.close();
    switch (x) {
      case 'A':
        System.out.println("Excellent");
        break;
      
      case 'B':
        System.out.println("Good job");
        break;
      
      case 'C':
        System.out.println("Passing grade");
        break;
      
      case 'D':
        System.out.println("Need Improvement");
        break;
      
      case 'E':
        System.out.println("Failed");
        break;
      default:
        break;
    }

  }
}

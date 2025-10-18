import java.util.Scanner;

public interface Switch {
  // Take month fro user and print number of the days present in the month
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the month: ");
    int n = s.nextInt();
    s.close();
    switch (n) {
      case 1:
        System.out.println(31 + " Days");
        break;
      
      case 2:
        System.out.println(29);
        break;
      
      case 3:
        System.out.println(31);
        break;

      case 4:
        System.out.println(30);
        break;

      case 5:
        System.out.println(31);
        break;

      case 6:
        System.out.println(30);
        break;

      case 7:
        System.out.println(31);
        break;

      case 8:
        System.out.println(30);
        break;

      case 9:
        System.out.println(30);
        break;

      case 10:
        System.out.println(31);
        break;

      case 11:
        System.out.println(30);
        break;

      case 12:
        System.out.println(31);
        break;


      default:
        break;

      
    }
  }
}

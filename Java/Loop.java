import java.util.Scanner;
//  Looping statements are used to Execute the same set of instructions multiple times based on the given condition

public class Loop {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    s.close();

    // For Loop
    for (int i=1; i<=n; i++){
      System.out.println("*");
    }

    System.out.println("----------------");

    // While Loop
    while(n>0){
      System.out.println("Fahad");
      n = n-1;
    }
    System.err.println("==========Fahad============");
    
    System.out.println("-----------------");

    // Do While Loop
    do {
      System.out.println(n);
      n++;
    } while (n<=10);
  }
}
 
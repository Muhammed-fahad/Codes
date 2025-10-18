import java.util.ArrayList;
import java.util.Scanner;

public class Dynamic {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    while (true) {
      int n = s.nextInt();
      if(n == -1){
        break;
      }
      arr.add(n);
    }
    for (Integer i : arr) {
      System.out.print(i + " ");
    }
    s.close();
  }
}

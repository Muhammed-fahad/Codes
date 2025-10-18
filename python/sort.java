import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sort {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    ArrayList <Integer> arr = new ArrayList<>();
    while (true) {
      int n = s.nextInt();
      if (n==-1){
        break;
      }
      arr.add(n);
    }
    Collections.sort(arr);
    System.out.print(arr);
    s.close();
  }
}


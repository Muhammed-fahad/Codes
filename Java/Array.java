import java.util.ArrayList;
import java.util.Scanner;

public class Array {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] arr = new int[5];

    // Type one
    for (int i=0;i<5;i++){
      System.out.print("Enter a Number: ");
      arr[i] = s.nextInt();  
    }

    // Type Two
    ArrayList<Integer> arr1 = new ArrayList<>();
    while (true) {
      int n = s.nextInt();
      if(n != -1){
        arr1.add(n);
      }
      else{
        break;
      }
    }

    // print
    for (int i : arr1){
      System.out.println("num : "+ i);
    }
    s.close();
  }
}

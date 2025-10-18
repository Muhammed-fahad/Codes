import java.util.Scanner;

public class even_print {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    s.close();
    while(n>0){
      int k = n%10;
      if(k%2 == 0){
        System.out.println(k);
      }
      n = n/10;
    }
  }
}


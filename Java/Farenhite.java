import java.util.Scanner;

class Farenhite {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);  
    float c = s.nextFloat();              
    float f = c*(9/5)+32;

    System.out.println("The Farenheit is : "+ f);
    s.close();
  }
}

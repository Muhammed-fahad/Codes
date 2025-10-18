public class Rectangle {
  Rectangle(int a , int b){
    int value = a*b;
    System.out.println(value);
  }
  public static void main(String[] args) {
    // printing the area of rectangle
    Rectangle r1 = new Rectangle(7, 8);
    Rectangle r2 = new Rectangle(4, 6);

    // print the dimensions of the rectangle
    System.out.println("Length of rectangle 1: " + r1.length + ", Width of rectangle 1: " + r1.width);
    System.out.println("Length of rectangle 2: " + r2.length + ", Width of rectangle 2: " + r2.width);
    System.out.println("Area of rectangle 1: " + r1.area + ", Area of rectangle 2: " + r2.area);
    System.out.println("Perimeter of rectangle 1: " + r1.perimeter + ", Perimeter of rectangle 2: " + r2.perimeter);
    System.out.println("Diagonal of rectangle 1: " + r1.diagonal + ", Diagonal of rectangle 2: " + r2.diagonal);

    System.out.println("Area of rectangle 1: " + r1.area + ", Area of rectangle 2: " + r2.area);
    System.out.println("Perimeter of rectangle 1: " + r1.perimeter + ", Perimeter of rectangle 2: " + r2.perimeter);
    
  }
}

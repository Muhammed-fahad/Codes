class Laptop{
  int sno;
  String brand;
  float price;
  double model_num;
  public static void main(String[] args) {
    Laptop l1 = new Laptop();
    Laptop l2 = new Laptop();
    Laptop l3 = new Laptop();

    l1.sno = 1; l1.brand = "Lenovo" ; l1.price = 43000.00f; l1.model_num = 23433433;
    l2.sno = 2; l2.brand = "Acer" ; l2.price = 50000.00f; l2.model_num = 89828746;
    l3.sno = 3; l3.brand = "HP" ; l3.price = 67000.00f; l3.model_num = 683294-230;

    System.out.println("Laptop Name: " + l1.sno + " " + l1.brand + " " + l1.price + " " + l1.model_num);
    System.out.println(l2.sno + " " + l2.brand + " " + l2.price + " " + l2.model_num);
    System.out.println(l3.sno + " " + l3.brand + " " + l3.price + " " + l3.model_num);

    System.out.println(Restuarent.Restuarant_name);  // It is in another file called Restaurent
  }
}
class Restuarent{
  int sno;
  static String Restuarant_name = "Fahad";
  float price_biriyani;
  double restuarent_rating;
  public static void main(String[] args) {
    Restuarent r1 = new Restuarent();
    Restuarent r2 = new Restuarent();
    Restuarent r3 = new Restuarent();

    r1.sno = 1; r1.price_biriyani = 430.00f; r1.restuarent_rating = 2;
    r2.sno = 2; r2.price_biriyani = 500.00f; r2.restuarent_rating = 8;
    r3.sno = 3; r3.price_biriyani = 670.00f; r3.restuarent_rating = 6;

    System.out.println(r1.sno + " " + Restuarant_name + " " + r1.price_biriyani + " " + r1.restuarent_rating);
    System.out.println(r2.sno + " " + Restuarant_name + " " + r2.price_biriyani + " " + r2.restuarent_rating);
    System.out.println(r3.sno + " " + Restuarant_name + " " + r3.price_biriyani + " " + r3.restuarent_rating);
  }
}
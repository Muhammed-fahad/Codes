public class Laptop1 {

  String LapName;
  int price ;
  float model_num;
  char varient;

  static int year = 2025;

  public static void main(String[] args) {

    Laptop1 l1 = new Laptop1();
    Laptop1 l2 = new Laptop1();
    Laptop1 l3 = new Laptop1();

    l1.LapName="Accer";
    l1.price = 56699;
    l1.model_num = 98.9f;
    l1.varient = 'c';

    l2.LapName = "dell";
    l2.price = 76734;
    l2.model_num=45.7f;
    l2.varient = 'k';

    l3.LapName = "Mac";
    l3.price = 687238;
    l3.model_num=457.7f;
    l3.varient = 'f';


  }
}

public class Person {
  String Name;
  int age;
  Person(String Name , int age){
    this.Name = Name;
    this.age = age;
  }
  public static void main(String[] args) {
    Person p1 = new Person("Fahad",21);
    Person p2 = new Person("Nadeem" , 16);
    System.out.println(p1.Name + " "+p1.age);
    System.out.println(p2.Name + " " +p2.age);
  }
}

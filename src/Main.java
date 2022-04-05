public class Main {
  public static void main(String[] args) {
    Animal d1 = new Dog("Fido");
    Animal c1 = new Cat("Fnuggi");

    d1.makeSound();
    c1.makeSound();

    d1.eat("Dog Food");
    c1.eat("Fish");
  }
}

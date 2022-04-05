public class Cat extends Animal{
  Cat(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Meow");
  }
}

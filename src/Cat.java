public class Cat extends Animal{
  Cat(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Meow");
  }

  @Override
  public boolean eat(String foodType) {
    return true;
  }

  @Override
  public void showMood(boolean mood) {
    if (mood) {
      System.out.println("Spinder");
    }else {
      System.out.println("Hvæser");
    }
  }
}

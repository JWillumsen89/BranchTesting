public class Dog extends Animal{
  Dog(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Vuf");
  }

  @Override
  public boolean eat(String foodType) {
    return true;
  }

  @Override
  public void showMood(boolean mood) {
    if (mood) {
      System.out.println("Logrer");
    }else{
      System.out.println("Knurrer");
    }
  }
}

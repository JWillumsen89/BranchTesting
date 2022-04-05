public abstract class Animal {
  private String name;

  Animal(String name) {
    this.name = name;
  }

  public abstract void makeSound();

  public abstract boolean eat(String foodType);

  public abstract void showMood(boolean mood);
}

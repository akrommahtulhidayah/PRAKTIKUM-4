package Hierarchical;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Kitty");

        dog.eat();
        dog.bark();

        cat.eat();
        cat.meow();
    }
}
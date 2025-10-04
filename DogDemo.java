// Interface untuk hewan yang bisa berbicara
interface Talkable {
    void talk();
}

// Interface untuk hewan yang bisa bergerak
interface Movable {
    void move();
}

// Class Dog mengimplementasikan kedua interface
class Dog implements Talkable, Movable {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void talk() {
        System.out.println(name + " says: Woof! Woof!");
    }

    @Override
    public void move() {
        System.out.println(name + " is running.");
    }
}

// Main class untuk menjalankan program
public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.talk();  // Output: Buddy says: Woof! Woof!
        myDog.move();  // Output: Buddy is running.
    }
}

// Child class 1

package Hierarchical;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " adalah anjing.");
    }
}

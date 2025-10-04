// Child class 2

package Hierarchical;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(getName() + " adalah kucing.");
    }
}

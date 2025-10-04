// Parent class

package Hierarchical;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " adalah hewan peliharaan .");
    }

    public String getName() {
        return name;
    }
}

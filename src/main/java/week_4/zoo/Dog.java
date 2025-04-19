package week_4.zoo;

public class Dog extends Animal{
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(this.name + " barked!");
    }
}

package week_4;

import week_4.zoo.Animal;
import week_4.zoo.Cat;
import week_4.zoo.Dog;

public class Main {
    public static void makeItSound(Animal animal) {
        animal.makeSound();
    }
    public static void main(String[] args) {
        Dog bobby = new Dog("Bobby");
        Cat dong = new Cat("Catty");

        makeItSound(bobby);
        makeItSound(dong);

    }
}

package week_4.homeworks;

public class Polymorphism {
    // Zoo class with polymorphism
    public static class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public void makeSound() {
        }
    }

    public static class Lion extends Animal {
        // Override makeSound
        public Lion(String name) {
            super(name);
        }

        public void makeSound() {
            System.out.println(this.name + " roared!");
        }

    }

    public static class Tiger extends Animal {
        // Override makeSound
        public Tiger(String name) {
            super(name);
        }

        public void makeSound() {
            System.out.println(this.name + " ROARED!");
        }
    }

    public static class Bear extends Animal {
        // Override makeSound
        public Bear(String name) {
            super(name);
        }

        public void makeSound() {
            System.out.println(this.name + " BOARRRRED");
        }
    }

    public static class Zoo {
        public static void main(String[] args) {
            // Create an array of Animal
            Animal[] animals = new Animal[] {
                    new Lion("Simba"),
                    new Tiger("Simon"),
                    new Bear("Bobby")
            };


            for (Animal animal : animals) {
                animal.makeSound();
            }
        }
    }
}

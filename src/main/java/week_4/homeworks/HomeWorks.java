package week_4.homeworks;

public class HomeWorks {
    public static class Dog {
        private String name;
        private String breed;

        public Dog(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }

        public void bark() {
            System.out.println(this.name + " the " + this.breed + " barked.");
        }

        @Override
        public String toString() {
            return name + " the " + breed;
        }

        // Main method for testing
        public static void main(String[] args) {
            Dog myDog = new Dog("Buddy", "Golden Retriever");
            myDog.bark(); // Output: Buddy the Golden Retriever barked.
        }
    }

}

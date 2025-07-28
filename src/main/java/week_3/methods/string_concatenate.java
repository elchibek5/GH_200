package week_3.methods;

import java.util.Random;

public class string_concatenate {
    public static String concatenate(String string, int num) {
        String[] emojis = {"😊", "🚀", "🔥", "🎉", "😎", "💡", "🧠", "🌈", "🍕", "🎮"};
        Random rand = new Random();
        StringBuilder emojiTrail = new StringBuilder();

        for (int i = 0; i < num % 7 + 1; i++) {
            emojiTrail.append(emojis[rand.nextInt(emojis.length)]);
        }

        return string + num + " " + emojiTrail;
    }

    public static String getRandomFunFact() {
        String[] facts = {
                "Bananas are berries, but strawberries aren’t! 🍌❌🍓",
                "Honey never spoils. Archaeologists found 3000-year-old honey! 🍯",
                "Octopuses have three hearts and blue blood. 🐙💙",
                "You can't hum while holding your nose. Try it! 🤭",
                "The Eiffel Tower can grow over 6 inches in summer! 🗼☀️"
        };
        return facts[new Random().nextInt(facts.length)];
    }

    public static String generateNickname(String base) {
        String[] suffixes = {"inator", "zilla", "master", "nator", "the Great", "XD", "💀"};
        return base + suffixes[new Random().nextInt(suffixes.length)];
    }

    public static void main(String[] args) {
        String baseName = "Hello ";
        int luckyNumber = 45;

        String result = concatenate(baseName, luckyNumber);
        String nickname = generateNickname("Elchi");
        String funFact = getRandomFunFact();

        System.out.println("✨ Welcome to the Fun Zone ✨");
        System.out.println("==============================");
        System.out.println("🎩 Your cool nickname is: " + nickname);
        System.out.println("🔢 Here's your lucky string: " + result);
        System.out.println("📚 Fun Fact: " + funFact);
        System.out.println("🔍 " + luckyNumber + " is " + (luckyNumber % 2 == 0 ? "even 🔢" : "odd 🧮"));
        System.out.println("==============================");
    }
}

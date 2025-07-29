package week_3.methods;

import java.util.Random;

public class emoji_battle {

    public static void main(String[] args) {
        String[] emojis = {"🐉", "🦄", "🤖", "👽", "🧙", "🧛", "🦍", "🦕", "🧟", "🦸"};

        Random random = new Random();

        String fighter1 = emojis[random.nextInt(emojis.length)];
        String fighter2 = emojis[random.nextInt(emojis.length)];

        while (fighter1.equals(fighter2)) {
            // Ensure two different fighters
            fighter2 = emojis[random.nextInt(emojis.length)];
        }

        System.out.println("🥊 WELCOME TO EMOJI BATTLE ARENA 🥊");
        System.out.println("==================================");
        System.out.println("Fighter 1: " + fighter1);
        System.out.println("Fighter 2: " + fighter2);
        System.out.println("⚔️  The battle begins...");

        // Simulate a random winner
        String winner = random.nextBoolean() ? fighter1 : fighter2;

        System.out.println("🏆 Winner is: " + winner + "!!!");
        System.out.println("==================================");
        System.out.println("Thanks for watching 🎬");
    }
}

package week_3.methods;

import java.util.Random;

public class string_concatenate {
    public static String concatenate(String string, int num) {
        String[] emojis = {"😊", "🚀", "🔥", "🎉", "😎", "💡", "🧠"};
        Random rand = new Random();
        String emojiTrail = "";

        for (int i = 0; i < num % 5; i++) {
            emojiTrail += emojis[rand.nextInt(emojis.length)];
        }

        return string + num + " " + emojiTrail;
    }

    public static void main(String[] args) {
        System.out.println(concatenate("Hello ", 45));
        System.out.println("Did you know? 45 is " + (45 % 2 == 0 ? "even 🔢" : "odd 🧮"));
    }
}

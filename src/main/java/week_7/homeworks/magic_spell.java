package week_7.homeworks;

import java.util.*;
import java.util.stream.*;

public class magic_spell {
    public static void main(String[] args) {
        String[] syllables = {"abra", "cad", "zoo", "lum", "nox", "hex", "vox", "tor", "flam", "blitz"};
        Random rand = new Random();

        String spell = IntStream.range(0, 3 + rand.nextInt(3))
                .mapToObj(i -> syllables[rand.nextInt(syllables.length)])
                .collect(Collectors.joining("-"));

        System.out.println("🪄 Casting spell: " + spell.toUpperCase() + "!");
    }
}

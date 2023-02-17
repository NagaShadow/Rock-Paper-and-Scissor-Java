package org.example;
import java.util.*;

public enum Move {
    PIERRE, PAPIER, CISEAUX;

    private static final List<Move> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Move randomMove()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public static Move getByName(String name) {
        try {
            return valueOf(name.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}

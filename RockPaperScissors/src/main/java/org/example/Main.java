package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game nouvellePartie = new Game();
        nouvellePartie.start("USER", "IA");
    }
}
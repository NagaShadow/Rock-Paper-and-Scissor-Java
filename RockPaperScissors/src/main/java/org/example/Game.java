package org.example;

import java.sql.SQLOutput;

public class Game {

    private Player player1, player2;
    private static int MAX_POINTS = 3;

    public void start(String player1Type, String player2Type){
        Player player1 = new Player(player1Type);
        Player player2 = new Player(player2Type);
        do {
            Round newRound = new Round(player1, player2);
            newRound.start();
        } while (player1.getScore() < MAX_POINTS && player2.getScore() < MAX_POINTS);

        displayGameResult(player1, player2);
    }

    public void displayGameResult(Player player1, Player player2){
        int nbrRound = Round.getNbrRound();
        System.out.println("Nombre de tours joués : " + nbrRound);

        if(player1.getScore() > player2.getScore()){
            System.out.println("Victoire de joueur n°1");
        } else{
            System.out.println("Victoire de joueur n°2");
        }
    }
}

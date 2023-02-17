package org.example;
import java.util.Random;
import java.util.Scanner;

public class Player {

    private PlayerType type;
    private int score = 0;

    public Player(String playerType) {
        this.type = org.example.PlayerType.valueOf(playerType);
        this.score = 0;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Move play(){
        Move myRandomMove = null;
        if(this.type.equals(PlayerType.IA)){
            myRandomMove = Move.randomMove();
        } else {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("\n1.Pierre\n2.Papier\n3.Ciseaux\n\nEntrez votre réponse : ");
                String choix = in.nextLine();

                if(Move.getByName(choix) != null){
                    myRandomMove = Move.valueOf(choix);
                }
            } catch (Exception e){
                System.out.println(e.getMessage() + "\n Erreur lors de l'action.");
            }
        }
        return myRandomMove;
    }

    public void incrementScore(){
        this.score++;
    }
}

package org.example;

public class Round {
    private static int nbrRound;
    private Player player1, player2;

    public Round(Player player1, Player player2) {
        nbrRound++;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(){
        System.out.println("Round N°" + getNbrRound());
        Move player1Move = player1.play();
        Move player2Move = player2.play();
        checkwinner(player1Move, player2Move);
        System.out.println("Player 1 : " + player1.getScore() + " | Player 2 : " + player2.getScore() +"\n");
    }

    public static boolean isPlayer1Win (Move player1Move, Move player2Move) {
        Move[] validMovesList = Move.values();
        return player1Move.equals(validMovesList[0]) && player2Move.equals(validMovesList[2])
                || player1Move.equals(validMovesList[2]) && player2Move.equals(validMovesList[1])
                || player1Move.equals(validMovesList[1]) && player2Move.equals(validMovesList[0]);
    }
    public void checkwinner(Move player1Move, Move player2Move){
        if(player1Move == player2Move){
            System.out.println("Égalité.");
        }
        else if(isPlayer1Win(player1Move, player2Move)){
            System.out.println("Gagné !!");
            player1.incrementScore();
        }
        else {
            System.out.println("Perdu...");
            player2.incrementScore();
        }
    }


    public static int getNbrRound() {
        return nbrRound;
    }

    public void setNbrRound(int nbrRound) {
        this.nbrRound = nbrRound;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
}

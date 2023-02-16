package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pointJoueur = 0, pointIA = 0;
        String [] choixIA = {"Pierre", "Papier", "Ciseaux"};

        System.out.println("Pierre - Papier - Ciseaux ");
        System.out.println("Rappel des règles :");
        System.out.println("La Pierre bat le ciseaux. Le Ciseaux bat le papier. Et le Papier bat la pierre.");
        System.out.println("Le premier joueur qui arrive à 3 points gagne la partie.");

        do {
            Random random = new Random();
            int select = random.nextInt(choixIA.length);
            Scanner in = new Scanner(System.in);
            System.out.print("\n1.Pierre\n2.Papier\n3.Ciseaux\n\nEntrez votre réponse : ");
            String choix = in.nextLine();

            //Vérification de la chaine de charactère.
            boolean continuer=true;
            do{
                if(choix.matches("^[a-zA-Z]*$")){
                    continuer=false;
                }
            } while(continuer);

            switch(choix){
                case "Pierre":
                    if(select == 0){
                        System.out.println("Égalité");
                    } else if (select == 1) {
                        System.out.println("Perdu...");
                        pointIA++;
                    }
                    else {
                        System.out.println("Gagné !");
                        pointJoueur++;
                    }
                    break;
                case "Papier":
                    if(select == 0){
                        System.out.println("Gagné ! ");
                        pointJoueur++;
                    } else if (select == 1) {
                        System.out.println("Égalité");
                    }else {
                        System.out.println("Perdu...");
                        pointIA++;
                    }
                    break;
                case "Ciseaux":
                    if(select == 0){
                        System.out.println("Perdu...");
                        pointIA++;
                    } else if (select == 1) {
                        System.out.println("Gagné !");
                        pointJoueur++;
                    } else {
                        System.out.println("Égalité");
                    }
                    break;
                default:
                    System.out.println("Choix incorrect. Veuillez respecter l'orthographe des mots proposer.");
                    break;
            }
        }
        while (pointJoueur != 3 && pointIA != 3);
        if(pointIA ==3){
            System.out.println("Vous avez perdu la partie...");
            System.out.println("Score Final : Vous : " + pointJoueur + " | IA : " + pointIA);
        }
        else {
            System.out.println("Vous avez gagné la partie ! Félicitations");
            System.out.println("Score Final : Vous : " + pointJoueur + " | IA : " + pointIA);
        }
    }
}
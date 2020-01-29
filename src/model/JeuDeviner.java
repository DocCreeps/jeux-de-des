/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author bthouverez
 */
public class JeuDeviner {
    private De de;
    private int compteur;
    
    public JeuDeviner() {
        this.de = new De(100);
        this.compteur = 0;
    }
    
    public void jouer() {
        System.out.println("Bienvenue dans le jeu du dé à deviner");
        this.de.lancer();
        int valeur = 0;
        while(valeur != this.de.getValeur()) {
            System.out.println("Quelle est la valeur du dé ?");
            Scanner scanner = new Scanner(System.in);
            valeur = scanner.nextInt();
            this.compteur++;

            if(valeur == this.de.getValeur()) {
                System.out.println("BRAVO, tu as trouvé en "+this.compteur+" coups!");
            } else if(valeur < this.de.getValeur()){
                System.out.println("NON, c'est plus grand !");
            } else if(valeur > this.de.getValeur()) {
                System.out.println("NON, c'est plus petit !");
            }
        }
    }
}

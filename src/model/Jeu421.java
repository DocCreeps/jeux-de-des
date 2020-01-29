/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bthouverez
 */
public class Jeu421 {

    private De de1;
    private De de2;
    private De de3;

    public Jeu421() {
        this.de1 = new De();
        this.de2 = new De();
        this.de3 = new De();
    }

    public String toString() {
        String res = "";
        res += this.de1.toString() + "\n";
        res += this.de2.toString() + "\n";
        res += this.de3.toString() + "\n";
        return res;
    }

    public boolean partieGagnee() {
        // Possibilité de faire bien plus joli ...
        boolean trouve1 = false;
        boolean trouve2 = false;
        boolean trouve4 = false;
        
        if(this.de1.getValeur() == 1 ||
           this.de2.getValeur() == 1 ||
           this.de3.getValeur() == 1)
            trouve1 = true;
        if(this.de1.getValeur() == 2 ||
           this.de2.getValeur() == 2 ||
           this.de3.getValeur() == 2)
            trouve2 = true;
        if(this.de1.getValeur() == 4 ||
           this.de2.getValeur() == 4 ||
           this.de3.getValeur() == 4)
            trouve4 = true;
        
        return trouve1 && trouve2 && trouve4;
    }
    
    public void jouer() {
        this.de1.lancer();
        this.de2.lancer();
        this.de3.lancer();
        System.out.println( this );
        while (partieGagnee() == false) {
            System.out.println("Quel dé relancer?");
            Scanner scanner = new Scanner(System.in);
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    this.de1.lancer();
                    break;
                case 2:
                    this.de2.lancer();
                    break;
                case 3:
                    this.de3.lancer();
                    break;
                default:
                    break;
            }

            System.out.println(this);
        }
        System.out.println("Vous avez gagné !");
    }
}

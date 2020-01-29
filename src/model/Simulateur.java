/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bthouverez
 */
public class Simulateur {

    private int lancers[][];
    private De de;
    private int nbJoueur;
    private int nbLancer;

    public Simulateur() {
        this.nbJoueur = 10;
        this.nbLancer = 20;
        this.lancers = new int[this.nbJoueur + 1][this.nbLancer];
        this.de = new De();
        for (int idJoueur = 1; idJoueur < this.nbJoueur + 1; idJoueur++) {
            for (int idLancer = 0; idLancer < this.nbLancer; idLancer++) {
                this.lancers[idJoueur][idLancer] = 0;
            }
        }
    }
    
    public Simulateur(int nbJ, int nbL) {
        this.nbJoueur = nbJ;
        this.nbLancer = nbL;
        this.lancers = new int[this.nbJoueur + 1][this.nbLancer];
        this.de = new De();
        for (int idJoueur = 1; idJoueur < this.nbJoueur + 1; idJoueur++) {
            for (int idLancer = 0; idLancer < this.nbLancer; idLancer++) {
                this.lancers[idJoueur][idLancer] = 0;
            }
        }
    }
    
    

    public void afficheLancersJoueur(int idJoueur) {
        System.out.print("Lancer joueur " + idJoueur + " : ");
        for (int ii = 0; ii < this.nbLancer; ii++) {
            System.out.print(this.lancers[idJoueur][ii] + " ");
        }
        System.out.println("");
    }

    public int totalJoueur(int idJoueur) {
        int total = 0;
        for (int ii = 0; ii < this.nbLancer; ii++) {
            total += this.lancers[idJoueur][ii];
        }
        return total;
    }

    public int nombreDe6(int idJoueur) {
        int total = 0;
        for (int ii = 0; ii < this.nbLancer; ii++) {
            if (this.lancers[idJoueur][ii] == 6) {
                total++;
            }
        }
        return total;
    }

    public void remplir() {
        for (int idJoueur = 1; idJoueur < this.nbJoueur + 1; idJoueur++) {
            for (int idLancer = 0; idLancer < this.nbLancer; idLancer++) {
                this.de.lancer();
                this.lancers[idJoueur][idLancer] = this.de.getValeur();
            }
        }
    }

    public String toString() {
        String res = "";
        for (int idJoueur = 1; idJoueur < this.nbJoueur + 1; idJoueur++) {
            for (int idLancer = 0; idLancer < this.nbLancer; idLancer++) {
                res += this.lancers[idJoueur][idLancer] + " ";
            }
            res += "\n";
        }
        return res;
    }
}

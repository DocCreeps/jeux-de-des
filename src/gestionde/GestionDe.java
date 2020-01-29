/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde;

import View.WindowsDeviner;
import model.Jeu421;
import model.JeuDeviner;
import model.Simulateur;

/**
 *
 * @author thouverez
 */
public class GestionDe {

    /*
      @param args the command line arguments
    */
    public static void main(String[] args) {
     /*   
        Simulateur sim = new Simulateur(3, 5);
        sim.remplir();
        for (int ii = 1; ii < 4; ii++) {
            sim.afficheLancersJoueur(ii);
            System.out.println("Total : " + sim.totalJoueur(ii) + "["+sim.nombreDe6(ii)+"]");
        }
         

        Jeu421 jeu421 = new Jeu421();
        jeu421.jouer();


        JeuDeviner jeuDeviner = new JeuDeviner();
        jeuDeviner.jouer(); */
    
        WindowsDeviner win = new WindowsDeviner();
        win.setVisible(true);
    
    }
 }



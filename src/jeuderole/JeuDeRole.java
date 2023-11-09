/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jeuderole;

import javax.swing.Icon;
import javax.swing.JOptionPane;
import metier.Guerrier;
import metier.Personnages;
import metier.Sorcier;
import metier.Voleur;

/**
 *
 * @author solen
 */
public class JeuDeRole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Guerrier leGuerrier1 = new Guerrier("Invincible", "Guerrier05.JPG", 30, 10, "Epée");
        System.out.println("nom de leGuerrier1 : " + leGuerrier1);

        Guerrier leGuerrier2 = new Guerrier("Invincible", "Guerrier05.JPG", 30, 10, "Epée");
        System.out.println("nom de leGuerrier2 : " + leGuerrier2);

        if (leGuerrier1.equals(leGuerrier2)) {
            System.out.println("leGuerrier1 et leGuerrier2 sont identiques");
        } else {
            System.out.println("leGuerrier1 et leGuerrier2 sont différents");
        }

        Guerrier leGuerrier3 = new Guerrier("Spartacus", "Guerrier05.JPG", 30, 10, "Epée");
        System.out.println("nom de leGuerrier1 : " + leGuerrier1);

        if (leGuerrier1.equals(leGuerrier3)) {
            System.out.println("leGuerrier1 et leGuerrier3 sont identiques");
        } else {
            System.out.println("leGuerrier1 et leGuerrier3 sont differents");
        }

        Sorcier laSorciere = new Sorcier ("ReineSorciere","Sorciere1.JPG",20,30,"pomme",null);
        System.out.println("nom de laSorciere : " + laSorciere);
        
        Voleur leVoleur1 =new Voleur ("Arsene Lupin", "Barbare04.JPG",15,25,"Pince");
        System.out.println("nom de leVoleur1 : " + leVoleur1);
        
        
        laSorciere.rencontrer(leGuerrier1);
        
        
        
        
    }
}

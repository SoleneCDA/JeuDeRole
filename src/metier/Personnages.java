/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.Objects;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author solen
 */
public class Personnages {
// Variables membres

    private String nom;
    private String img;
    private int energie;
    private int dureeVie;

    /**
     * Constructeur : valorisation des variables membres
     *
     * @param nom nom du personnage
     * @param img nom de l'image du personnage
     * @param energie valeur énergétique
     * @param dureeVie durée de vie, en année
     */
    public Personnages(String nom, String img, int energie, int dureeVie) {
        this.nom = nom;
        this.img = img;
        this.energie = energie;
        this.dureeVie = dureeVie;
    }

    /**
     * Permet d'obtenir les valeurs des attributs de l'objet courant
     *
     * @return liste des attributs avec leurs valeurs
     */
    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", img=" + img + ",energie=" + energie + ", dureeVie=" + dureeVie + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personnages other = (Personnages) obj;
        if (this.energie != other.energie) {
            return false;
        }
        if (this.dureeVie != other.dureeVie) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return Objects.equals(this.img, other.img);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nom);
        hash = 97 * hash + Objects.hashCode(this.img);
        hash = 97 * hash + this.energie;
        hash = 97 * hash + this.dureeVie;
        return hash;
    }

    public String rencontrer(Personnages unePersonne) {
        String titre = this.getNom() + " rencontre " + unePersonne.getNom();
        String message = "Bonjour " + unePersonne.getNom() + "!";
        
        JOptionPane.showMessageDialog(null, message, titre, JOptionPane.INFORMATION_MESSAGE);
       
        Icon imgPersonnages = new javax.swing.ImageIcon(getClass().getResource("/images/" + this.getImg()));
        JOptionPane.showMessageDialog(null, message, titre,JOptionPane.INFORMATION_MESSAGE , imgPersonnages);
       
        return message;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getEnergie() {
        return energie;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }

    public int getDureeVie() {
        return dureeVie;
    }

    public void setDureeVie(int dureeVie) {
        this.dureeVie = dureeVie;
    }

}

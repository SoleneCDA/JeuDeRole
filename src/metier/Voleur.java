/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.Objects;

/**
 *
 * @author solen
 */
public class Voleur extends Personnages {
// Variable membre

    private String outil;

    /**
     * Constructeur : valorisation des variables membres
     *
     * @param nom nom du voleur
     * @param img nom de l'image représentant le voleur
     * @param energie valeur énergétique du voleur
     * @param dureeVie durée de vie du voleur
     * @param outil outil du voleur
     */
    public Voleur(String nom, String img, int energie, int dureeVie, String outil) {
        super(nom, img, energie, dureeVie);
        this.outil = outil;
    }

    /**
     * Permet d'obtenir les valeurs des attributs de l'objet courant
     *
     * @return liste des attributs avec leurs valeurs
     */
    @Override
    public String toString() {
        return super.toString() + "\n\tVoleur{" + "outil=" + outil + '}';
    }

    /**
     * Comparaison de l'objet courant avec l'objet passé en paramètre
     *
     * @param obj objet à comparer avec l'objet courant
     * @return true : les 2 objets sont identiques, false sinon
     */
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
        final Voleur other = (Voleur) obj;
        if (!super.equals(other)) {
            return false;
        }
        if (!Objects.equals(this.outil, other.outil)) {
            return false;
        }
        return true;
    }
@Override
public String rencontrer(Personnages unePersonne) {
return "Gare à toi, j'ai mon  : " + outil;
}
}

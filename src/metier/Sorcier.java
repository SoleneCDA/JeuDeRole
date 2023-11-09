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
public class Sorcier extends Personnages {
// Variable membre

    private String baguette;
    private String enigme;

    /**
     * Constructeur : valorisation des variables membres
     *
     * @param nom nom du sorcier
     * @param img nom de l'image représentant le sorcier
     * @param energie valeur énergétique du sorcier
     * @param dureeVie durée de vie du sorcier
     * @param baguette baguette du sorcier
     * @param enigme enigme du sorcier
     */
    public Sorcier(String nom, String img, int energie, int dureeVie, String baguette, String enigme) {
        super(nom, img, energie, dureeVie);
        this.baguette = baguette;
        this.enigme = enigme;
    }

    /**
     * Permet d'obtenir les valeurs des attributs de l'objet courant
     *
     * @return liste des attributs avec leurs valeurs
     */
    @Override
    public String toString() {
        return super.toString() + "\n\tSorcier{ " + "baguette= " + baguette + "," + "enigme= " + enigme+'}';
}
/**
* Comparaison de l'objet courant avec l'objet passé en paramètre
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
        final Sorcier other = (Sorcier) obj;
        if (!super.equals(other)) {
            return false;
        }
        if (!Objects.equals(this.baguette, other.baguette)) {
            return false;
        }
        if (!Objects.equals(this.enigme, other.enigme)) {
            return false;
        }
        return true;
    }
//@Override
//public String rencontrer(Personnages unePersonne) {
//return "Je vais te jeter un sort avec ma : " + baguette;
//}
}

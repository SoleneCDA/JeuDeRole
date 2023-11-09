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

    public class Guerrier extends Personnages{
// Variable membre
private String arme;
/**
* Constructeur : valorisation des variables membres
* @param nom nom du guerrier
* @param img nom de l'image représentant le guerrier
* @param energie valeur énergétique du guerrier
* @param dureeVie durée de vie du guerrier
* @param arme arme du guerrier
*/
public Guerrier(String nom, String img, int energie, int dureeVie,String arme) {
super(nom, img, energie, dureeVie);
this.arme = arme;
}
/**
* Permet d'obtenir les valeurs des attributs de l'objet courant
* @return liste des attributs avec leurs valeurs
*/
@Override
public String toString() {
return super.toString() + "\n\tGuerrier{" + "arme=" + arme +'}';
}
/**
* Comparaison de l'objet courant avec l'objet passé en paramètre
* @param obj objet à comparer avec l'objet courant
* @return true : les 2 objets sont identiques, false sinon
*/
@Override
public boolean equals(Object obj) {
if (this == obj) { return true; }
if (obj == null) { return false; }
if (getClass() != obj.getClass()) { return false; }
final Guerrier other = (Guerrier) obj;
if (!super.equals(other)) { return false; }
if (!Objects.equals(this.arme, other.arme)) { return false; }
return true;
}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.arme);
        return hash;
    }

@Override
public String rencontrer(Personnages unePersonne) {
return "Attention à toi, sauve-toi vite avant que je ne te frappe avec mon arme redoutable : " + arme;
}

}

package org.example.dresseur

import org.example.monstre.IndividuMonstre

/**
 * Représente un entraîneur dans le contexte du jeu.
 *
 * Un entraîneur est responsable de gérer une équipe de monstres, une boîte pour stocker des monstres supplémentaires
 * et un sac contenant des objets appelés MonsterKubes. L'entraîneur a également une somme d'argent associée.
 *
 * @property id L'identifiant unique de l'entraîneur.
 * @property nom Le nom de l'entraîneur.
 * @property argents La quantité d'argent en possession de l'entraîneur.

 */

class Entraineur(var id: Int,
                 var nom: String,
                 var argents: Int,
    var equipeMonstre: MutableList<IndividuMonstre> = mutableListOf(),
    var boiteMonstre: MutableList<IndividuMonstre> = mutableListOf())
{

    /* TODO sacAKube*/

    fun afficheDetail() {
        println("Dresseur : ${this.nom}")
        println("Argents : ${this.argents}")

    }

}

package org.example.jeu

import org.example.dresseur.Entraineur
import org.example.especeAquamy
import org.example.especeFlamkip
import org.example.especeSpringleaf
import org.example.monde.Zone
import org.example.monstre.IndividuMonstre

/**
 * Cette classe ..
 *
 * @property id
 * @property joueur
 * @property zone
 */

class Partie (
    var id : Int,
    var joueur : Entraineur,
    var zone : Zone
) {

    /**
     * Cette méthode
     *
     * @property starter xx
     * @property monstre1
     */

    fun choixStarter() {
        var starter : IndividuMonstre? = null
        val monstre1 = IndividuMonstre(1,"Springleaf", especeSpringleaf,null,1500.0)
        val monstre2 = IndividuMonstre(2,"Flampkip", especeFlamkip,null,1500.0)
        val monstre3 = IndividuMonstre(3,"Aquamy", especeAquamy,null,1500.0)

        monstre1.afficheDetail() //Springleaf
        monstre2.afficheDetail() //Flampkip
        monstre3.afficheDetail() //Aquamy

        println("Choisissez un monstre parmis les 3 : \n" +
                "1 : Springleaf \n" +
                "2: Flampkip \n" +
                "3: Aquamy")

        var choixSelection = readln().toInt()

        while (choixSelection !in 1..3) {
            choixStarter()
        }

        if (choixSelection == 1) {
            starter = monstre1
        } else if (choixSelection == 2) {
            starter = monstre2
        } else {
            starter = monstre3
        }

        starter.renommer()
        joueur.equipeMonstre.add(starter)
        starter.entraineur  = joueur

    }

    /**
     * Cette méthode blabala
     *
     * @property posInit On souhaite avoir la position
     * @property postNext On souhaite avoir la nouvelle position.
     * @property monstrePosInit
     * @property monstrePosNext
     *
     */

    fun modifierOrdreEquipe() {
        if (joueur.equipeMonstre.isNotEmpty()) { // Si la liste (qui représente l'équpe du joueur) n'est pas vide
            println("Quelle est la position initiale du monstre dans la tcheam ? ")
            var posInit = readln().toInt()

            println("Quelle est la nouvelle position du monstre ? : ")
            var posNext = readln().toInt()

            var monstrePosInit = joueur.equipeMonstre[posInit]
            var monstrePosNext = joueur.equipeMonstre[posNext]

            joueur.equipeMonstre[posInit] = monstrePosNext
            joueur.equipeMonstre[posNext] = monstrePosInit
            println(joueur.equipeMonstre)
        }
    }

    /**
     * Cette méthode permet simplement d’afficher les informations des monstres qui composent
     * l'équipe du joueur et demande au joueur s'il souhaite modifier l’ordre des monstres.
     *
     *
     */
    fun examnieEquipe () {
        for (()in joueur.equipeMonstre.withIndex() ) {

        }
    }
//méthode  jouer




}
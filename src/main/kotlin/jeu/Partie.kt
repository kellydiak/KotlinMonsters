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
     *
     */

    fun choixStarter() {
        val monstre1 = IndividuMonstre(1,"Springleaf", especeSpringleaf,null,1500.0)
        val monstre2 = IndividuMonstre(2,"Flampkip", especeFlamkip,null,1500.0)
        val monstre3 = IndividuMonstre(3,"Aquamy", especeAquamy,null,1500.0)

        monstre1.afficheDetail() //Springleaf
        monstre2.afficheDetail() //Flampkip
        monstre3.afficheDetail() //Aquamy

        println()
    }


}
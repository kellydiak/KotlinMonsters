package org.example.monstre

import org.example.dresseur.Entraineur

/**
 * Cette classe représente chaque individu, c'est-à-dire les monstres avec le joueur va interagir
 * (les monstres sauvages, les monstres de l’équipe du joueur, les monstres des autres dresseurs).
 *
 * Il y a un nombre conséquent de propriétés et de méthodes.
 *
 *
 * @constructor IndividuMonstre :
 * @param expInit
 * @property id
 * @property nom
 * @property espece
 * @property entraineur
 * @property niveau
 * @property attaque
 * @property
 * @property
 * @property
 * @property
 */

class IndividuMonstre constructor(
    var id: Int,
    var nom: String,
    var espece: EspeceMonstre,
    var entraineur: Entraineur? = null,
    expInit: Double
) {
    var niveau: Int = 1
    //var attaque: Int =


    //var potentiel = (0.5..2.0)


}
package org.example.monstre

import org.example.dresseur.Entraineur
import java.util.concurrent.ThreadLocalRandom
import kotlin.random.Random
import kotlin.random.nextInt

/**
 * Cette classe représente chaque individu, c'est-à-dire les monstres avec le joueur va interagir
 * (les monstres sauvages, les monstres de l’équipe du joueur, les monstres des autres dresseurs).
 *
 * Il y a un nombre conséquent de propriétés et de méthodes.
 *
 *
 * @constructor IndividuMonstre :
 * @param expInit
 * @
 * @property id
 * @property nom
 * @property espece
 * @property entraineur
 * @property niveau représente le niveau actuel du monstre.
 * @property attaque représente la puissance de l'attaque du monstre.
 * @property defense représente la puissance de la défense du monstre.
 * @property vitesse
 * @property attaqueSpe
 * @property defenseSpe
 * @property pvMax
 * @property potentiel
 * @property exp
 * @property pv représente les points de vie actuels.
 * Ne peuvent pas être inférieurs à 0 ni supérieurs à pvMax
 */

class IndividuMonstre constructor(
    var id: Int,
    var nom: String,
    var espece: EspeceMonstre,
    var entraineur: Entraineur? = null,
    expInit: Double
) {
    var niveau: Int = 1
    var attaque: Int = listOf<Int>(-2,2).random()
    //var defense: Int =
    //var vitesse: Int =
    //var attaqueSpe: Int =
    //var defenseSpe: Int =
    //var pvMax: Int =
    //var potentiel =
    var exp: Double = 0.0

    var pv: Int = pvMax
        get() = field
        set(nouveauPv) {
            field= if (nouveauPv < 0 || nouveauPv > pvMax) {
                    println("error")
                } else {
                    return nouveauPv
            }

        }

    
    fun palierExp() {

    }




    }





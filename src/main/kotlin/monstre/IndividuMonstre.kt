package org.example.monstre

import org.example.dresseur.Entraineur
import java.util.concurrent.ThreadLocalRandom
import kotlin.math.pow
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.math.round

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
    var attaque: Int = espece.baseAttaque + listOf<Int>(-2,2).random()
    var defense: Int = espece.baseDefense + listOf<Int>(-2,2).random()
    var vitesse: Int = espece.baseVitesse + listOf<Int>(-2,2).random()
    var attaqueSpe: Int = espece.baseAttaqueSpe + listOf<Int>(-2,2).random()
    var defenseSpe: Int = espece.baseDefenseSpe + listOf<Int>(-2,2).random()
    var pvMax: Int = espece.basePv + listOf<Int>(-5,5).random()
    var potentiel: Double = Random.nextDouble(0.5,2.0)


    var exp: Double = 0.0
        get() = field
        set(value) {
            if (niveau == 1) {
                print(true)
            } else {
                print(false)
            }
            while (field >= palierExp(niveau)) {
                levelUp()

            }

        }



    var pv: Int = pvMax
        get() = field
        set(nouveauPv) {
            field = if ((nouveauPv < 0) || (nouveauPv > pvMax)) 0 else nouveauPv
        }

    /**
     * Cette classe calcule l'expérience totale nécessaire pour atteindre un niveau donné.
     *
     * @param niveau Niveau cible.
     * @return Expérience cumulée nécessaire pour atteindre ce niveau.
     */

    fun palierExp(niveau: Int) : Int {
        var expCumulee = 100*(niveau-1).toDouble().pow(2.0).toInt()
        return expCumulee
    }

    /**
     * Cette classe augmente le niveau d'un monstre.
     * De plus elle recalcule les nouvelles valeurs des caractéristiques.
     *
     *
     */

    fun levelUp() {
        niveau += 1

        attaque = round((espece.modAttaque * potentiel)).toInt() + listOf<Int>(-2,2).random()
        defense = round((espece.modDefense * potentiel)).toInt() + listOf<Int>(-2,2).random()
        vitesse = round((espece.modVitesse * potentiel)).toInt() + listOf<Int>(-2,2).random()
        attaqueSpe = round((espece.modAttaqueSpe * potentiel)).toInt() + listOf<Int>(-2,2).random()
        defenseSpe = round((espece.modDefense * potentiel)).toInt() + listOf<Int>(-2,2).random()
        pvMax = round((espece.modPv * potentiel)).toInt() + Random.nextInt(-5,5)

        pv += pvMax
    }


}





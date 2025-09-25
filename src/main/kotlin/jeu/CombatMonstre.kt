package org.example.jeu

import org.example.joueur
import org.example.monstre.IndividuMonstre

/**
 * Cette classe permet de
 *
 *
 * @property monstreJoueur xxx
 * @property monstreSauvage xxx
 * @property round xxx
 */


class CombatMonstre(var monstreJoueur: IndividuMonstre,
                    var monstreSauvage: IndividuMonstre
) {
    var round: Int = 1

    /**
     * Cette méthode permet de déterminer si le joueur a perdu ou pas.
     *
     * Condition de défaite :
     * - Aucun monstre de l'équipe du joueur n'a de PV > 10.
     *
     * @return `true` si le joueur a perdu, sinon `false`.
     */

    fun gameOver () : Boolean {
        if() {

        }
    }

    /**
     * Méthode qui indique si le joueur a gagné le combat.
     * Il y a deux façons de gagner le combat :
     * - Capturer le montre sauvage
     * - Ou amener les pvs du monstre sauvage à 0.
     * Le monstre du joueur gagne de l'expérience seulement dans le 2e cas.
     *
     * @return `true` si le joueur a gagné, sinon `false`.
     */

    fun joueurGagne () : Boolean {
        if (monstreSauvage.pv <= 0) {
            println("${joueur.nom} a gagné !")
            var gainExp = monstreSauvage.exp*0.20
            gainExp += monstreJoueur.exp
            println("${monstreJoueur.nom} gagne ${gainExp}")
            return true
        } else {
            if (monstreSauvage.entraineur == joueur) {
                println("${monstreSauvage.nom} a été capturé !")
                return true
            } else {
                return false
            }
        }
    }

    /**
     * faire la doc dessus
     */

    fun actionAdversaire() {
        if (monstreSauvage.pv > 0) {
            monstreSauvage.attaquer(monstreJoueur)
        }
    }

// methode ,actionJoueur, afficheCOmbat, jouer



}
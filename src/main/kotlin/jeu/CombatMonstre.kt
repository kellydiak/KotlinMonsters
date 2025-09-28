package org.example.jeu

import org.example.dresseur.Entraineur
import org.example.item.Item
import org.example.joueur // faire appel à l'objet crée "joueur" permet l'accès aux propriétés de la classe Entraineur
import org.example.monstre.EspeceMonstre
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

    fun gameOver () : Boolean =
        joueur.equipeMonstre.none() {it.pv > 10}


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

    /**
     * Cette méthode permet au joueur d’effectuer plusieurs actions. Retourne true si le combat doit continuer sinon false.
     * - Si le joueur tape 1 : le monstre du joueur attaque le monstre sauvage.
     * - Si le joueur tape 2 : on donne la possibilité au joueur d'utiliser un item
     * - Si le joueur tape 3 : le joueur peut changer son monstre actuel contre un autre monstre de son équipe
     */

    fun actionJoueur() : Boolean {
        if (gameOver()) {
            return false
        }
        println("Voici ce que vous pouvez faire : \n" +
                "Tapez 1 : Votre monstre attaque le monstre sauvage. \n" +
                "Tapez 2 : Utilisation d'un item. \n" +
                "Tapez 3 : Switcher de monstre.")
        var choixAction: Int = readln().toInt()

        if (choixAction == 1) {
            monstreJoueur.attaquer(monstreSauvage)

        } else if (choixAction == 2 ) {
            println(joueur.sacAItems)
            var indexChoix: Int = readln().toInt()
            var objetChoisi = joueur.sacAItems[indexChoix]
            //TODO finir tout ca puree

        } else if (choixAction == 3) {
            print(joueur.equipeMonstre )
            var indexChoix: Int = readln().toInt()
            var choixMonstre = joueur.equipeMonstre[indexChoix]

        } else {
            print("chiffre invalide !")
        }



        return true
    }

    /**
     * Cette méthode affiche les données du monstre du joueur et du monstre sauvage ainsi que leur ascii art.
     */

    fun afficheCombat() {
        println("======== Début Round : $round ========")
        println("Niveau : ${monstreSauvage.niveau}")
        println("PV : ${monstreSauvage.pv / monstreSauvage.pvMax}")
        println(monstreSauvage.espece.afficheArt())
        println(monstreJoueur.espece.afficheArt(false))
        println("Niveau : ${monstreJoueur.niveau}")
        println("PV : ${monstreJoueur.pv / monstreJoueur.pvMax}")
    }

    /**
     * Cette méthode fait jouer les deux monstres (honneur à celui dont la vitesse est élevée).
     * Si l'appel de this.actionJoueur() retourne false, on arrête l'exécution de la méthode jouer() avec un return vide.
     */

    fun jouer() {
        var joueurPlusRapide = monstreJoueur.vitesse >= monstreSauvage.vitesse
        afficheCombat()
        if (joueurPlusRapide ) {
            var continuer = this.actionJoueur()
            if (continuer == false) {
                return
            } else {
                actionAdversaire()
            }
        } else {
            actionAdversaire()
            if (gameOver() == false) {
                var continuer = this.actionJoueur()

                if (continuer == false ){
                    return
                }
            return
            }
        }
    }

    /**
     * Cette méthode lance le combat et gère les rounds jusqu'à la victoire ou la défaite.
     *
     * Affiche un message de fin si le joueur perd et restaure les PV de tous ses monstres.
     *
     */

    fun lancerCombat() {
        while (!gameOver() && !joueurGagne()) {
            this.jouer()
            println("======== Fin du Round : $round ========")
            round++
        }
        if (gameOver()) {
            joueur.equipeMonstre.forEach { it.pv = it.pvMax }
            println("Game Over !")
        }
    }



}
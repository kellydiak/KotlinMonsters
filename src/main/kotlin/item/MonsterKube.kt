package org.example.item
import org.example.joueur
import org.example.monstre.IndividuMonstre
import kotlin.random.Random
import kotlin.random.nextInt

/**
 * Cette classe permet de capturer et de stocker les monstres.
 * On hérite de la classe mère Item pour récupérer les paramètres.
 *
 * @param id
 * @param nom
 * @param description
 * @property chanceCapture détermine la chance de pouvoir capturer un Monstre.
 * TODO finir la description
 */

class MonsterKube(  id: Int,
                    nom: String,
                    description: String,
                var chanceCapture: Double

    ): Item(id, nom, description), Utilisable {

    /**
     * Cette méthode implémente l'interface [Utilisable].
     * Donc, on doit définir la méthode [utiliser] pour appliquer son effet.
     */

    override fun utiliser(cible: IndividuMonstre): Boolean {
        println("Vous lancez le Monster Kube ! ")
        if (cible.entraineur != null) {
            println("Le Monstre ne peut pas être capturé. ")
            return false
        } else {
            var nbAleatoire = Random.nextInt(0..100)
            if (nbAleatoire < chanceCapture) {
                println("Le monstre est capturé ! ")
                println("Veuillez insérer un nouveau nom : ")
                var nouveauNom =  readLine()

                if (nouveauNom != null) {
                    cible.nom = nouveauNom
                }
                if (joueur.equipeMonstre.size >= 6) {
                    joueur.boiteMonstre.add(cible)
                } else {
                    joueur.equipeMonstre.add(cible)
                }
                cible.entraineur = joueur
                return true
            } else {
                println("Presque ! Le Kube n'a pas pu capturer le monstre ! ")
                return false
            }
        }

    }

}
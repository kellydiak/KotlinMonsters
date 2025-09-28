package org.example.monde

import org.example.monstre.EspeceMonstre

/**
 * Cette classe représente un lieu où le joueur peut se déplacer et rencontrer des monstres.
 * À partir de là où on se trouve, on peut soit aller dans une zone antérieure (si possible) ou postérieure (si possible).
 *
 * @property id représente l'identification de la zone.
 * @property nom représente le nom de la zone.
 * @property expZone représente la quantité.
 * @property especesMonstres blahblah
 * @property zoneSuivante si on se trouve sur une zone x, c'est la zone x+1
 * @property zonePrecedente si on se trouve sur une zone x, c'est la zone x-1
 * //TODO finir la doc pour les proprietes expzone et especesmonstres
 * //TODO faire methodes : genereMonstre() & rencontreMontre()
 */

class Zone (
    var id: Int,
    var nom: String,
    var expZone: Int,
    val especesMonstres: MutableList<EspeceMonstre> = mutableListOf(),
    var zoneSuivante: Zone? = null,
    var zonePrecedente: Zone? = null
) {
    fun genereMonstre() {

    }

}
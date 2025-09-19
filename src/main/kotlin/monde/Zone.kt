package org.example.monde

/**
 * Représente un lieu où le joueur peut se déplacer et rencontrer des monstres.
 * À partir de là où on se trouve, on peut soit aller dans une zone antérieure (si possible) ou postérieure (si possible).
 *
 * @property id représente l'identification de la zone.
 * @property nom représente le nom de la zone.
 * @property expZone blahblah
 * @property especesMonstres blahblah
 * @property zoneSuivante si on se trouve à une zone x, c'est la zone x+1
 * @property zonePrecedente si on se trouve sur une zone x, c'est la zone x-1
 * //TODO finir la doc pour les proprietes expzone et especesmonstres
 */

class Zone (
    var id: Int,
    var nom: String,


) {

}
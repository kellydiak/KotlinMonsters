package org.example.monstre

/**
 * Cette classe repésente les différentes espèces de monstres
 *
 * definir blahblah
 * blahblah
 * TODO finir de ecrire les parametres
 * @property id L'identifiant unique de l'entraîneur.
 * @property nom Le nom de l'entraîneur.
 * @property type La quantité d'argent en possession de l'entraîneur.
 * @property baseAttaque
 * @property baseDefense
 * @property baseVitesse
 * @property baseAttaqueSpe
 * @property baseDefenseSpe
 * @property basePv
 * @property modAttaque
 * @property modDefense
 * @property modVitesse
 * @property modAttaqueSpe
 * @property modDefenseSpe
 * @property modPv
 * @property description
 * @property particularites
 * @property caracteres

 */

class EspeceMonstre(
    var id: Int,
    var nom: String,
    val baseAttaque: Int,
    val baseDefense: Int,
    val baseVitesse: Int,
    val baseAttaqueSpe: Int,
    val baseDefenseSpe: Int,
    val basePv:Int,
    val modAttaque: Double,
    val modDefense: Double,
    val modVitesse: Double,
    val modAttaqueSpe: Double,
    val modDefenseSpe: Double,
    val modPv: Double,
    val description: String = "",
    val particularites: String = "",
    val caracteres: String = ""
    ) {

    /**
     * Affiche la représentation artistique ASCII du monstre.
     *
     * @param deFace Détermine si l'art affiché est de face (true) ou de dos (false).
     *               La valeur par défaut est true.
     * @return Une chaîne de caractères contenant l'art ASCII du monstre avec les codes couleur ANSI.
     *         L'art est lu à partir d'un fichier texte dans le dossier resources/art.
     */




}
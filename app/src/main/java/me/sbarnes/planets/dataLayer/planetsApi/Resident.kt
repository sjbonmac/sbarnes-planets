package me.sbarnes.planets.dataLayer.planetsApi

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by simonbarnes on 06/03/2024
 **/
@Serializable
data class Resident (

    @SerialName("name"       ) var name      : String?           = null,
    @SerialName("height"     ) var height    : String?           = null,
    @SerialName("mass"       ) var mass      : String?           = null,
    @SerialName("hair_color" ) var hairColor : String?           = null,
    @SerialName("skin_color" ) var skinColor : String?           = null,
    @SerialName("eye_color"  ) var eyeColor  : String?           = null,
    @SerialName("birth_year" ) var birthYear : String?           = null,
    @SerialName("gender"     ) var gender    : String?           = null,
    @SerialName("homeworld"  ) var homeworld : String?           = null,
    @SerialName("films"      ) var films     : ArrayList<String> = arrayListOf(),
    @SerialName("species"    ) var species   : ArrayList<String> = arrayListOf(),
    @SerialName("vehicles"   ) var vehicles  : ArrayList<String> = arrayListOf(),
    @SerialName("starships"  ) var starships : ArrayList<String> = arrayListOf(),
    @SerialName("created"    ) var created   : String?           = null,
    @SerialName("edited"     ) var edited    : String?           = null,
    @SerialName("url"        ) var url       : String?           = null

)
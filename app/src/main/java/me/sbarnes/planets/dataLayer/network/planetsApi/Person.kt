package me.sbarnes.planets.dataLayer.network.planetsApi

import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by simonbarnes on 06/03/2024
 **/
@Keep
@Serializable
data class Person (

    @SerialName("name"       ) var name      : String?,
    @SerialName("height"     ) var height    : String?,
    @SerialName("mass"       ) var mass      : String?,
    @SerialName("hair_color" ) var hairColor : String?,
    @SerialName("skin_color" ) var skinColor : String?,
    @SerialName("eye_color"  ) var eyeColor  : String?,
    @SerialName("birth_year" ) var birthYear : String?,
    @SerialName("gender"     ) var gender    : String?,
    @SerialName("homeworld"  ) var homeworld : String?,
    @SerialName("films"      ) var films     : List<String>?,
    @SerialName("species"    ) var species   : List<String>?,
    @SerialName("vehicles"   ) var vehicles  : List<String>?,
    @SerialName("starships"  ) var starships : List<String>?,
    @SerialName("created"    ) var created   : String?,
    @SerialName("edited"     ) var edited    : String?,
    @SerialName("url"        ) var url       : String?

)
package me.sbarnes.planets.dataLayer.network.planetsApi
import androidx.annotation.Keep

import kotlinx.serialization.Serializable

import kotlinx.serialization.SerialName


/**
 * Created by simonbarnes on 07/03/2024
 **/
@Keep
@Serializable
data class Species(
    @SerialName("message") var message: String?,
    @SerialName("result") var result: Result?
)

@Keep
@Serializable
data class Result(
    @SerialName("description") var description: String?,
    @SerialName("id") var id: String?,
    @SerialName("properties") var properties: Properties?,
    @SerialName("uid") var uid: String?,
    @SerialName("__v") var v: Int?
)

@Keep
@Serializable
data class Properties(
    @SerialName("average_height") var averageHeight: String?,
    @SerialName("average_lifespan") var averageLifespan: String?,
    @SerialName("classification") var classification: String?,
    @SerialName("created") var created: String?,
    @SerialName("designation") var designation: String?,
    @SerialName("edited") var edited: String?,
    @SerialName("eye_colors") var eyeColors: String?,
    @SerialName("hair_colors") var hairColors: String?,
    @SerialName("homeworld") var homeworld: String?,
    @SerialName("language") var language: String?,
    @SerialName("name") var name: String?,
    @SerialName("people") var people: List<String?>?,
    @SerialName("skin_colors") var skinColors: String?,
    @SerialName("url") var url: String?
)
package me.sbarnes.planets.dataLayer.network.planetsApi

import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by simonbarnes on 07/03/2024
 **/

@Keep
@Serializable
data class PlanetsResult(
    @SerialName("name") var name: String?,
    @SerialName("uid") var uid: String?,
    @SerialName("url") var url: String?
)

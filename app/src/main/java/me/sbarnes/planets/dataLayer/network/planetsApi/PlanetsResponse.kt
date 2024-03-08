package me.sbarnes.planets.dataLayer.network.planetsApi

import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class PlanetsResponse (

  @SerialName("count"    ) var count    : Int?,
  @SerialName("next"     ) var next     : String?,
  @SerialName("previous" ) var previous : String?,
  @SerialName("results"  ) var planetsResults  : List<PlanetsResult>?

)
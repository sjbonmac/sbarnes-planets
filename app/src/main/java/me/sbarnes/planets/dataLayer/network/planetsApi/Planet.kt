package me.sbarnes.planets.dataLayer.network.planetsApi

import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class Planet (

  @SerialName("name"            ) var name           : String?,
  @SerialName("rotation_period" ) var rotationPeriod : String?,
  @SerialName("orbital_period"  ) var orbitalPeriod  : String?,
  @SerialName("diameter"        ) var diameter       : String?,
  @SerialName("climate"         ) var climate        : String?,
  @SerialName("gravity"         ) var gravity        : String?,
  @SerialName("terrain"         ) var terrain        : String?,
  @SerialName("surface_water"   ) var surfaceWater   : String?,
  @SerialName("population"      ) var population     : String?,
  @SerialName("residents"       ) var residents      : List<String>?,
  @SerialName("films"           ) var films          : List<String>?,
  @SerialName("created"         ) var created        : String?,
  @SerialName("edited"          ) var edited         : String?,
  @SerialName("url"             ) var url            : String?

)
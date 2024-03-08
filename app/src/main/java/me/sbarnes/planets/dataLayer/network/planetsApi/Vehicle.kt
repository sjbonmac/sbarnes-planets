package me.sbarnes.planets.dataLayer.network.planetsApi
import androidx.annotation.Keep

import kotlinx.serialization.Serializable

import kotlinx.serialization.SerialName


/**
 * Created by simonbarnes on 06/03/2024
 **/
@Keep
@Serializable
data class Vehicle(
    @SerialName("cargo_capacity"         ) var cargoCapacity: String?,
    @SerialName("consumables"            ) var consumables: String?,
    @SerialName("cost_in_credits"        ) var costInCredits: String?,
    @SerialName("created"                ) var created: String?,
    @SerialName("crew"                   ) var crew: String?,
    @SerialName("edited"                 ) var edited: String?,
    @SerialName("films"                  ) var films: List<String?>?,
    @SerialName("length"                 ) var length: String?,
    @SerialName("manufacturer"           ) var manufacturer: String?,
    @SerialName("max_atmosphering_speed" ) var maxAtmospheringSpeed: String?,
    @SerialName("model"                  ) var model: String?,
    @SerialName("name"                   ) var name: String?,
    @SerialName("passengers"             ) var passengers: String?,
    @SerialName("pilots"                 ) var pilots: List<String?>?,
    @SerialName("url"                    ) var url: String?,
    @SerialName("vehicle_class"          ) var vehicleClass: String?
)
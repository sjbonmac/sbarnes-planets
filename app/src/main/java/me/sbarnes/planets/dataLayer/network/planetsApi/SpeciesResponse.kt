package me.sbarnes.planets.dataLayer.network.planetsApi
import androidx.annotation.Keep

import kotlinx.serialization.Serializable

import kotlinx.serialization.SerialName


/**
 * Created by simonbarnes on 07/03/2024
 **/
@Keep
@Serializable
data class SpeciesResponse(
    @SerialName("message") var message: String?,
    @SerialName("next") var next: String?,
    @SerialName("previous") var previous: String?,
    @SerialName("results") var results: List<SpeciesResult>?,
    @SerialName("total_pages") var totalPages: Int?,
    @SerialName("total_records") var totalRecords: Int?
)
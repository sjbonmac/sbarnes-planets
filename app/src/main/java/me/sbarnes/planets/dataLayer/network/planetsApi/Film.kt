package me.sbarnes.planets.dataLayer.network.planetsApi

import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by simonbarnes on 06/03/2024
 **/
@Keep
@Serializable
data class Film(
    @SerialName("characters"    ) val characters: List<String>,
    @SerialName("created"       ) val created: String,
    @SerialName("director"      ) val director: String,
    @SerialName("edited"        ) val edited: String,
    @SerialName("episode_id"    ) val episodeId: Int,
    @SerialName("opening_crawl" ) val openingCrawl: String,
    @SerialName("planets"       ) val planets: List<String>,
    @SerialName("producer"      ) val producer: String,
    @SerialName("release_date"  ) val releaseDate: String,
    @SerialName("species"       ) val species: List<String>,
    @SerialName("starships"     ) val starships: List<String>,
    @SerialName("title"         ) val title: String,
    @SerialName("url"           ) val url: String,
    @SerialName("vehicles"      ) val vehicles: List<String>
)
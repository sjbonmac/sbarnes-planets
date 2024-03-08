package me.sbarnes.planets.dataLayer.database.dataEntities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by simonbarnes on 06/03/2024
 **/
@Entity(tableName = "films")
data class FilmDataEntity(

    @PrimaryKey val id: String,
    @ColumnInfo("characters"    ) val characters: List<String>,
    @ColumnInfo("created"       ) val created: String,
    @ColumnInfo("director"      ) val director: String,
    @ColumnInfo("edited"        ) val edited: String,
    @ColumnInfo("episode_id"    ) val episodeId: Int,
    @ColumnInfo("opening_crawl" ) val openingCrawl: String,
    @ColumnInfo("planets"       ) val planets: List<Int>,
    @ColumnInfo("producer"      ) val producer: String,
    @ColumnInfo("release_date"  ) val releaseDate: String,
    @ColumnInfo("species"       ) val species: List<Int>,
    @ColumnInfo("starships"     ) val starships: List<Int>,
    @ColumnInfo("title"         ) val title: String,
    @ColumnInfo("url"           ) val url: String,
    @ColumnInfo("vehicles"      ) val vehicles: List<Int>

)

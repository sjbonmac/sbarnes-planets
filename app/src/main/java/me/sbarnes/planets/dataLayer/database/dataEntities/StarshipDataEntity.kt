package me.sbarnes.planets.dataLayer.database.dataEntities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by simonbarnes on 06/03/2024
 **/
@Entity(tableName = "starships")
data class StarshipDataEntity(

    @PrimaryKey val id: String,
    @ColumnInfo("cargo_capacity"         ) var cargoCapacity: String?,
    @ColumnInfo("consumables"            ) var consumables: String?,
    @ColumnInfo("cost_in_credits"        ) var costInCredits: String?,
    @ColumnInfo("created"                ) var created: String?,
    @ColumnInfo("crew"                   ) var crew: String?,
    @ColumnInfo("edited"                 ) var edited: String?,
    @ColumnInfo("films"                  ) var films: List<String>?,
    @ColumnInfo("hyperdrive_rating"      ) var hyperdriveRating: String?,
    @ColumnInfo("length"                 ) var length: String?,
    @ColumnInfo("MGLT"                   ) var mGLT: String?,
    @ColumnInfo("manufacturer"           ) var manufacturer: String?,
    @ColumnInfo("max_atmosphering_speed" ) var maxAtmospheringSpeed: String?,
    @ColumnInfo("model"                  ) var model: String?,
    @ColumnInfo("name"                   ) var name: String?,
    @ColumnInfo("passengers"             ) var passengers: String?,
    @ColumnInfo("pilots"                 ) var pilots: List<String>?,
    @ColumnInfo("starship_class"         ) var starshipClass: String?,
    @ColumnInfo("url"                    ) var url: String?
)
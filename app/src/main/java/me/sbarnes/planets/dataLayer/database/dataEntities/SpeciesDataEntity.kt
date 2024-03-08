package me.sbarnes.planets.dataLayer.database.dataEntities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * Created by simonbarnes on 07/03/2024
 **/
@Entity("species")
data class SpeciesDataEntity(
    @PrimaryKey
    @ColumnInfo("id") val id: String,
    @ColumnInfo("description") var description: String?,
    @ColumnInfo("averageHeight") var averageHeight: String?,
    @ColumnInfo("averageLifespan") var averageLifespan: String?,
    @ColumnInfo("classification") var classification: String?,
    @ColumnInfo("created") var created: String?,
    @ColumnInfo("designation") var designation: String?,
    @ColumnInfo("edited") var edited: String?,
    @ColumnInfo("eyeColors") var eyeColors: String?,
    @ColumnInfo("hairColors") var hairColors: String?,
    @ColumnInfo("homeworld") var homeworld: String?,
    @ColumnInfo("language") var language: String?,
    @ColumnInfo("name") var name: String?,
    @ColumnInfo("people") var people: List<String>?,
    @ColumnInfo("skinColors") var skinColors: String?,
    @ColumnInfo("url") var url: String?
)
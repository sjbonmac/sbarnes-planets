package me.sbarnes.planets.dataLayer.database.dataEntities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * Created by simonbarnes on 06/03/2024
 **/
@Entity(tableName = "people")
data class PersonDataEntity (

    @PrimaryKey val id: String,
    @ColumnInfo("name"       ) var name      : String?,
    @ColumnInfo("height"     ) var height    : String?,
    @ColumnInfo("mass"       ) var mass      : String?,
    @ColumnInfo("hair_color" ) var hairColor : String?,
    @ColumnInfo("skin_color" ) var skinColor : String?,
    @ColumnInfo("eye_color"  ) var eyeColor  : String?,
    @ColumnInfo("birth_year" ) var birthYear : String?,
    @ColumnInfo("gender"     ) var gender    : String?,
    @ColumnInfo("homeworld"  ) var homeworld : String?,
    @ColumnInfo("films"      ) var films     : List<Int>?,
    @ColumnInfo("species"    ) var species   : List<Int>?,
    @ColumnInfo("vehicles"   ) var vehicles  : List<Int>?,
    @ColumnInfo("starships"  ) var starships : List<Int>?,
    @ColumnInfo("created"    ) var created   : String?,
    @ColumnInfo("edited"     ) var edited    : String?,
    @ColumnInfo("url"        ) var url       : String?

)
package me.sbarnes.planets.dataLayer.database.dataEntities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by simonbarnes on 07/03/2024
 **/
@Entity
data class PlanetsDataEntity(

    @PrimaryKey
    @ColumnInfo("planet_id"       ) val planetId: String,
    @ColumnInfo("planet_name") val planetName: String,
    @ColumnInfo( "url") val url: String

)
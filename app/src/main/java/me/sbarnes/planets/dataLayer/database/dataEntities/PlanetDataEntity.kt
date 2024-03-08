package me.sbarnes.planets.dataLayer.database.dataEntities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "planets")
data class PlanetDataEntity (

  @PrimaryKey
  @ColumnInfo("planet_id"       ) val planetId       : String,
  @ColumnInfo("planet_name"     ) var name           : String?,
  @ColumnInfo("rotation_period" ) var rotationPeriod : String?,
  @ColumnInfo("orbital_period"  ) var orbitalPeriod  : String?,
  @ColumnInfo("diameter"        ) var diameter       : String?,
  @ColumnInfo("climate"         ) var climate        : String?,
  @ColumnInfo("gravity"         ) var gravity        : String?,
  @ColumnInfo("terrain"         ) var terrain        : String?,
  @ColumnInfo("surface_water"   ) var surfaceWater   : String?,
  @ColumnInfo("population"      ) var population     : String?,
  @ColumnInfo("residents"       ) var residents      : List<Int>,
  @ColumnInfo("films"           ) var films          : List<Int>,
  @ColumnInfo("created"         ) var created        : String?,
  @ColumnInfo("edited"          ) var edited         : String?,
  @ColumnInfo("url"             ) var url            : String?

)
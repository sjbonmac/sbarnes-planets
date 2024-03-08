package me.sbarnes.planets.dataLayer.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import me.sbarnes.planets.dataLayer.database.dataEntities.PlanetDataEntity

/**
 * Created by simonbarnes on 06/03/2024
 **/
@Dao
interface PlanetDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPlanets(vararg planets: PlanetDataEntity)

    @Query("SELECT * FROM planets WHERE planet_id = :planetId")
    fun getPlanet(planetId: String): Array<PlanetDataEntity>
}
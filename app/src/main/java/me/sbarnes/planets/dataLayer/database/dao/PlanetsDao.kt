package me.sbarnes.planets.dataLayer.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import me.sbarnes.planets.dataLayer.database.dataEntities.PlanetsDataEntity

/**
 * Created by simonbarnes on 07/03/2024
 **/
@Dao
interface PlanetsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPlanets(vararg planets: PlanetsDataEntity)

    @Query("SELECT * FROM planets")
    fun getAll(): Array<PlanetsDataEntity>
}
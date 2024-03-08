package me.sbarnes.planets.dataLayer.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import me.sbarnes.planets.dataLayer.database.dataEntities.SpeciesDataEntity

/**
 * Created by simonbarnes on 07/03/2024
 **/
@Dao
interface SpeciesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSpecies(vararg species: SpeciesDataEntity)

    @Query("SELECT *  FROM species WHERE id = :id")
    fun getSpecies(id: String) : Array<SpeciesDataEntity>
}
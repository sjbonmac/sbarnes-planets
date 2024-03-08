package me.sbarnes.planets.dataLayer.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import me.sbarnes.planets.dataLayer.database.dataEntities.StarshipDataEntity

/**
 * Created by simonbarnes on 07/03/2024
 **/
@Dao
interface StarshipDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertStarships(vararg starships: StarshipDataEntity)

    @Query("SELECT * FROM starships WHERE id = :id")
    fun getStarship(id: String): Array<StarshipDataEntity>
}
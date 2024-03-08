package me.sbarnes.planets.dataLayer.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import me.sbarnes.planets.dataLayer.database.dataEntities.FilmDataEntity

/**
 * Created by simonbarnes on 07/03/2024
 **/
@Dao
interface FilmDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFilms(vararg films: FilmDataEntity)

    @Query("SELECT * FROM films WHERE id IN (:filmIds)")
    fun getFilms(filmIds: List<String>): Array<FilmDataEntity>
}
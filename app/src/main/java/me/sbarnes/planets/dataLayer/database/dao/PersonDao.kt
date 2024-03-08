package me.sbarnes.planets.dataLayer.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import me.sbarnes.planets.dataLayer.database.dataEntities.PersonDataEntity

/**
 * Created by simonbarnes on 06/03/2024
 **/
@Dao
interface PersonDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPeople(vararg people: PersonDataEntity)

    @Query("SELECT * FROM people WHERE id = :personId")
    fun getPerson(personId: String): Array<PersonDataEntity>

}
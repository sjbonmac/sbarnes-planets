package me.sbarnes.planets.dataLayer.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import me.sbarnes.planets.dataLayer.database.dataEntities.VehicleDataEntity

/**
 * Created by simonbarnes on 07/03/2024
 **/
@Dao
interface VehicleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertVehicles(vararg vehicles: VehicleDataEntity)

    @Query("SELECT * FROM vehicles WHERE id = :id")
    fun getVehicle(id : String) : Array<VehicleDataEntity>
}
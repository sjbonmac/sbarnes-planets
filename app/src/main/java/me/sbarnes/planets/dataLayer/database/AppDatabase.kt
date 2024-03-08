package me.sbarnes.planets.dataLayer.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import me.sbarnes.planets.dataLayer.database.dao.PersonDao
import me.sbarnes.planets.dataLayer.database.dao.PlanetDao
import me.sbarnes.planets.dataLayer.database.dao.PlanetsDao
import me.sbarnes.planets.dataLayer.database.dao.SpeciesDao
import me.sbarnes.planets.dataLayer.database.dao.StarshipDao
import me.sbarnes.planets.dataLayer.database.dao.VehicleDao
import me.sbarnes.planets.dataLayer.database.dataEntities.Converters
import me.sbarnes.planets.dataLayer.database.dataEntities.FilmDataEntity
import me.sbarnes.planets.dataLayer.database.dataEntities.PersonDataEntity
import me.sbarnes.planets.dataLayer.database.dataEntities.PlanetDataEntity
import me.sbarnes.planets.dataLayer.database.dataEntities.PlanetsDataEntity
import me.sbarnes.planets.dataLayer.database.dataEntities.SpeciesDataEntity
import me.sbarnes.planets.dataLayer.database.dataEntities.StarshipDataEntity
import me.sbarnes.planets.dataLayer.database.dataEntities.VehicleDataEntity

/**
 * Created by simonbarnes on 07/03/2024
 **/
@TypeConverters(Converters::class)
@Database(
    entities = [
        FilmDataEntity::class,
        PersonDataEntity::class,
        PlanetDataEntity::class,
        PlanetsDataEntity::class,
        SpeciesDataEntity::class,
        StarshipDataEntity::class,
        VehicleDataEntity::class
               ],
    version = 1,
    exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun personDao(): PersonDao
    abstract fun planetDao(): PlanetDao
    abstract fun planetsDao(): PlanetsDao
    abstract fun speciesDao(): SpeciesDao
    abstract fun starshipDao(): StarshipDao
    abstract fun vehicleDao(): VehicleDao
}
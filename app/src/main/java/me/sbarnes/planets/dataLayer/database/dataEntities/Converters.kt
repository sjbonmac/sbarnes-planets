package me.sbarnes.planets.dataLayer.database.dataEntities

import androidx.room.TypeConverter
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

/**
 * Created by simonbarnes on 08/03/2024
 **/
class Converters {

    @TypeConverter
    fun listStringToJson(value: List<String>?)= Json.encodeToString(value = value)

    @TypeConverter
    fun jsonToListString(value: String) : List<String> {
        return Json.decodeFromString<List<String>>(value)
    }

    @TypeConverter
    fun listIntToJson(value: List<Int>) = Json.encodeToString(value)

    @TypeConverter
    fun jsonToListInt(value: String) : List<Int> {
        return Json.decodeFromString(value)
    }
}
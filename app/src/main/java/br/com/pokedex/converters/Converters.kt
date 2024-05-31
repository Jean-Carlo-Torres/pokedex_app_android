package br.com.pokedex.converters

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.Gson

@TypeConverters(Converters::class)
class Converters {

    @TypeConverter
    fun fromStringToList(value: String): List<String> {
        return Gson().fromJson(value, Array<String>::class.java).toList()
    }

    @TypeConverter
    fun fromListToString(list: List<String>): String {
        return Gson().toJson(list)
    }
}
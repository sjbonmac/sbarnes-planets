package me.sbarnes.planets.dataLayer.network

import me.sbarnes.planets.dataLayer.network.planetsApi.Film
import me.sbarnes.planets.dataLayer.network.planetsApi.PlanetsResponse
import me.sbarnes.planets.dataLayer.network.planetsApi.Person
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by simonbarnes on 06/03/2024
 **/
interface PlanetsApi {

    @GET("https:https://swapi.dev/api/planets/")
    suspend fun getPlanets(): Call<PlanetsResponse>

    @GET("{path}")
    suspend fun getNextPlanets(@Path("path") path: String): Call<PlanetsResponse>

    @GET("{path}")
    suspend fun getPerson(@Path("path") path: String): Call<Person>
    @GET("{path}")
    suspend fun getFilm(@Path("path") path: String): Call<Film>

}
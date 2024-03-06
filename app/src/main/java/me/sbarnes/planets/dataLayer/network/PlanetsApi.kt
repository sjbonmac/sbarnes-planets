package me.sbarnes.planets.dataLayer.network

import me.sbarnes.planets.dataLayer.planetsApi.PlanetsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by simonbarnes on 06/03/2024
 **/
interface PlanetsApi {

    @GET("https:https://swapi.dev/api/planets/")
    fun getPlanets(): Call<PlanetsResponse>

    @GET("{path}")
    fun getNextPlanets(@Path("path") path: String): Call<PlanetsResponse>
}
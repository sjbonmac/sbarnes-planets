package me.sbarnes.planets.domainLayer.entities

/**
 * Created by simonbarnes on 08/03/2024
 **/
data class DomainResponse<T>(var result: Result<T>)

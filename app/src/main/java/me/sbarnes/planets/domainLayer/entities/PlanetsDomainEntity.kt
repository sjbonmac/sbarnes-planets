package me.sbarnes.planets.domainLayer.entities

import me.sbarnes.planets.dataLayer.database.dataEntities.PlanetsDataEntity
import me.sbarnes.planets.dataLayer.network.planetsApi.PlanetsResult

/**
 * Created by simonbarnes on 08/03/2024
 **/
data class PlanetsDomainEntity(
    val planetId: String?,
    val planetName: String?,
    val url: String?
)


fun PlanetsDataEntity.toDomainEntity(): PlanetsDomainEntity {
    return PlanetsDomainEntity(this.planetId, this.planetName, this.url)
}

fun PlanetsDomainEntity.toDataEntity(): PlanetsDataEntity {
    return PlanetsDataEntity(this.planetId!!, this.planetName!!, this.url!!)
}

fun PlanetsResult.toDomainEntity(): PlanetsDomainEntity {
    return PlanetsDomainEntity(this.uid, this.name, this.url)
}

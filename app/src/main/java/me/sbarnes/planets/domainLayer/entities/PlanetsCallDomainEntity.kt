package me.sbarnes.planets.domainLayer.entities

import me.sbarnes.planets.dataLayer.network.planetsApi.PlanetsResponse
import timber.log.Timber

/**
 * Created by simonbarnes on 08/03/2024
 **/
data class PlanetsCallDomainEntity(
    var count: Int?,
    var next: String?,
    var planets: List<PlanetsDomainEntity>?
)

fun PlanetsResponse.toDomainEntity(): PlanetsCallDomainEntity {
    return PlanetsCallDomainEntity(
        this.count,
        this.next,
        this.planetsResults?.map { it.toDomainEntity() })
}

fun DomainResponse<PlanetsCallDomainEntity>.fromPlanetsResponse(
    response: PlanetsResponse?,
    error: Throwable?
): DomainResponse<PlanetsCallDomainEntity> {

    val result: Result<PlanetsCallDomainEntity> = if ((response == null) && (error != null)) {
        Result.failure(exception = error)
    } else {
        if (response != null) {
            Result.success(response.toDomainEntity())
        } else {
            Result.failure(Throwable(cause = UnknownError()))
        }
    }
    if (error != null) {
        Timber.e(error, "Exception in DomainResponse<PlanetsCallDomainEntity>.fromPlanetsResponse")
    }

    return DomainResponse(result)
}

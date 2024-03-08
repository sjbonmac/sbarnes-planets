package me.sbarnes.planets

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * Created by simonbarnes on 07/03/2024
 **/
@HiltAndroidApp
class PlanetsApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // Logging only in Debug build
        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
    }

}
package com.chunkytofustudios.native_geofence.model

import IosGeofenceSettingsWire
import kotlinx.serialization.Serializable

@Serializable
class IosGeofenceSettingsStorage(
    private val initialTrigger: Boolean
) {
    companion object {
        fun fromWire(e: IosGeofenceSettingsWire): IosGeofenceSettingsStorage {
            return IosGeofenceSettingsStorage(
                e.initialTrigger
            )
        }
    }

    fun toWire(): IosGeofenceSettingsWire {
        return IosGeofenceSettingsWire(
            initialTrigger
        )
    }
}
package com.udacity.project4.utils

import android.content.Context
import com.google.android.gms.location.GeofenceStatusCodes
import com.google.android.gms.location.R
import com.google.android.gms.maps.model.LatLng
import java.util.concurrent.TimeUnit

/**
 * Returns the error string for a geofencing error code.
 */
fun errorMessage(context: Context, errorCode: Int): String {
    val resources = context.resources
    return when (errorCode) {
        GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE -> resources.getString(
            com.udacity.project4.R.string.geofence_not_available
        )
        GeofenceStatusCodes.GEOFENCE_TOO_MANY_GEOFENCES -> resources.getString(
            com.udacity.project4.R.string.geofence_too_many_geofences
        )
        GeofenceStatusCodes.GEOFENCE_TOO_MANY_PENDING_INTENTS -> resources.getString(
            com.udacity.project4.R.string.geofence_too_many_pending_intents
        )
        else -> resources.getString(com.udacity.project4.R.string.error_adding_geofence)
    }
}
internal object GeofencingConstants {

    /**
     * Used to set an expiration time for a geofence. After this amount of time, Location services
     * stops tracking the geofence. For this sample, geofences expire after one hour.
     */
    val GEOFENCE_EXPIRATION_IN_MILLISECONDS: Long = TimeUnit.HOURS.toMillis(1)
    const val GEOFENCE_RADIUS_IN_METERS = 100f
    const val ACTION_GEOFENCE_EVENT =
        "LocationFinder.Geofancesutils.ACTION_GEOFENCE_EVENT"
}


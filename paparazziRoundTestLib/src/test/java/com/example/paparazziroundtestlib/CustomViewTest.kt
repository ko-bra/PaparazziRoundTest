package com.example.paparazziroundtestlib

import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class CustomViewTest {

    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.GALAXY_WATCH4_CLASSIC_LARGE,
        theme = "android:Theme.Material.Light.NoActionBar",
    )

    @Test
    fun textShouldSayRound() {

        val view = CustomView(paparazzi.context)
        paparazzi.snapshot(view)
    }
}
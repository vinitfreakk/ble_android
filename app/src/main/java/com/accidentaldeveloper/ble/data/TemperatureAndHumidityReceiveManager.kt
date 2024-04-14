package com.accidentaldeveloper.ble.data

import com.accidentaldeveloper.ble.utils.Resource
import kotlinx.coroutines.flow.MutableSharedFlow

interface TemperatureAndHumidityReceiveManager {

    val data:MutableSharedFlow<Resource<TempHumidityResult>>

    fun reconnect()

    fun disconnect()

    fun startReceiving()

    fun closeConnection()

}
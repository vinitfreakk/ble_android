package com.accidentaldeveloper.ble.data.ble

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothGatt
import android.bluetooth.le.ScanSettings
import android.content.Context
import com.accidentaldeveloper.ble.data.TempHumidityResult
import com.accidentaldeveloper.ble.data.TemperatureAndHumidityReceiveManager
import com.accidentaldeveloper.ble.utils.Resource
import kotlinx.coroutines.flow.MutableSharedFlow
import javax.inject.Inject

class TemperatureAndHumidityBLEReceiveManager @Inject constructor(
    private val bluetoothAdapter: BluetoothAdapter,
    private val context: Context
) : TemperatureAndHumidityReceiveManager {


    override val data: MutableSharedFlow<Resource<TempHumidityResult>>
        get() = MutableSharedFlow()


    private val bleScanner by lazy {
        bluetoothAdapter.bluetoothLeScanner
    }

    private val scanSettings = ScanSettings.Builder()
        .setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY)
        .build()

    private var gatt: BluetoothGatt? = null

    private var isScanning = false

    override fun startReceiving() {
        TODO("Not yet implemented")
    }

    override fun reconnect() {
        TODO("Not yet implemented")
    }

    override fun disconnect() {
        TODO("Not yet implemented")
    }


    override fun closeConnection() {
        TODO("Not yet implemented")
    }


}
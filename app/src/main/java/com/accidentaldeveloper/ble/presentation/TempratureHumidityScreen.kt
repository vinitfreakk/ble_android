package com.accidentaldeveloper.ble.presentation

import android.bluetooth.BluetoothAdapter
import android.media.Spatializer.OnSpatializerStateChangedListener
import androidx.compose.runtime.Composable
import com.accidentaldeveloper.ble.presentation.permissions.SystemBroadcastReceiver

@Composable
fun TemperatureHumidityScreen(
onBlueStateChangedListener:()->Unit

){
      SystemBroadcastReceiver(systemAction = BluetoothAdapter.ACTION_STATE_CHANGED){bluetoothState->

          val action = bluetoothState?.action?: return@SystemBroadcastReceiver
          if(action==BluetoothAdapter.ACTION_STATE_CHANGED){
              onBlueStateChangedListener()
          }
      }
}
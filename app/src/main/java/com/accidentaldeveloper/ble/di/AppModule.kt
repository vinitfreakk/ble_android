package com.accidentaldeveloper.ble.di

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Context
import com.accidentaldeveloper.ble.data.TemperatureAndHumidityReceiveManager
import com.accidentaldeveloper.ble.data.ble.TemperatureAndHumidityBLEReceiveManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideBluetoothAdapter(@ApplicationContext context: Context):BluetoothAdapter{
        val manager = context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        return manager.adapter
    }

    @Provides
    @Singleton
    fun providesTempHumidityReceiveManager(
        @ApplicationContext context: Context,
        bluetoothAdapter: BluetoothAdapter
    ):TemperatureAndHumidityReceiveManager{
        return TemperatureAndHumidityBLEReceiveManager(bluetoothAdapter,context)
    }
}
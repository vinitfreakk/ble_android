package com.accidentaldeveloper.ble.data

sealed interface ConnectionState  {
    object Connected:ConnectionState
    object Disconnected:ConnectionState
    object Uninitialized:ConnectionState
    object CurrentlyInitializing:ConnectionState

}
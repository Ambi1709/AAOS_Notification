package com.example.my_assingment

class SpeedMonitorSimulator : SpeedMonitor {
    private val carSpeeds = mutableMapOf<String, Int>()

    fun updateSpeed(car: String, speed: Int) {
        carSpeeds[car] = speed
    }

    override fun getCurrentSpeed(car: String): Int {
        return carSpeeds[car] ?: 0
    }
}
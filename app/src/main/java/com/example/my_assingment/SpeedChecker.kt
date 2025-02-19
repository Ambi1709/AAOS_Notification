package com.example.my_assingment

class SpeedChecker(
    private val repository: Repository,
    private val speedMonitor: SpeedMonitor,
    private val notification: Notification,
                  ) {
    fun checkSpeed(car: String) {
        val rental = repository.rentByCar(car) ?: return
        val currentSpeed = speedMonitor.getCurrentSpeed(car)

        if (currentSpeed > rental.maxSpeed) {
            val msg = "Speed limit is crossed of ${rental.maxSpeed} KM/H"
            notification.sendNotificationAlert(rental.renter, msg)
        }
    }
}
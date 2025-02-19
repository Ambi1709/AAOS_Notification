package com.example.my_assingment

class Main {
}

fun main() {
    val repository = Repository()
    val speedMonitor = SpeedMonitorSimulator()
    val notification = FBNotifier()
    val speedChecker = SpeedChecker(repository,speedMonitor,notification)


    val renter = RentalCar(renter = "Ambika", car = "Maruti", maxSpeed = 100)
    repository.addRent(renter)

    speedMonitor.updateSpeed("Maruti",90)

    speedChecker.checkSpeed("Maruti")
}
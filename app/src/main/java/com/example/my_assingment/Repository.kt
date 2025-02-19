package com.example.my_assingment

class Repository {
    private val rent = mutableMapOf<String, RentalCar>()

    fun addRent(rentalCar: RentalCar) {
        rent[rentalCar.car] = rentalCar
    }

    fun rentByCar(car: String): RentalCar? {
        return rent[car]
    }
}
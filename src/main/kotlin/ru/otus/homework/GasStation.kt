package ru.otus.homework

import ru.otus.cars.Car

//класс заправки
class GasStation {
    fun toFuelCar(car:Car){
        when (car.tankMouth){
            is PetrolMouth -> car.tankMouth.toFuel(10)
            is LpgMouth -> car.tankMouth.toFuel(10)
            else -> {
                try {
                    car.tankMouth.toFuel(10)
                }
                catch(e:Exception) {
                    println("предотвратили взрыв на заправке")
                }
            }
        }
    }
}
package ru.otus.homework

class PetrolMouth(override val width: Int): TankMouth() {
    fun fuelPetrol(liters: Int){}

    override fun open() {
        println("Открываем крышку бензобака")
    }

    override fun close() {
        println("Закрываем крышку бензобака")
    }

}
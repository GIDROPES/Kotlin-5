package ru.otus.homework

class LpgMouth(override val width: Int) :TankMouth() {
    fun fuelLpg(liters: Int){}

    override fun open() {
        println("Открываем крышку газобака")
    }

    override fun close() {
        println("Закрываем крышку газозобака")
    }
}
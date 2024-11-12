package ru.otus.homework

class LpgMouth(override var width: Int) :TankMouth() {
    private fun fuelLpg(liters: Int){
        this.width += liters
    }

    override fun open() {
        println("Открываем крышку газобака")
    }

    override fun close() {
        println("Закрываем крышку газозобака")
    }

    override fun toFuel(liters: Int) {
        fuelLpg(liters)
    }

    override fun toString(): String {
        return "Газовое топливо"
    }

}
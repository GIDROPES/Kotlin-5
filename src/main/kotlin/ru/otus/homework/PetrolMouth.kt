package ru.otus.homework

class PetrolMouth(override var width: Int): TankMouth() {
    private fun fuelPetrol(liters: Int){
        this.width+=liters
    }

    override fun open() {
        println("Открываем крышку бензобака")
    }

    override fun close() {
        println("Закрываем крышку бензобака")
    }

    override fun toFuel(liters: Int) {
        fuelPetrol(liters)
    }

    override fun toString(): String {
        return "Бензиновое топливо"
    }
}
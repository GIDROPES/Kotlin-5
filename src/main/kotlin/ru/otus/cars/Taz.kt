package ru.otus.cars

import ru.otus.homework.TankMouth

object Taz: Car {
    /**
     * Номерной знак
     */
    override val plates: Car.Plates
        get() = throw NotImplementedError("Номера сняты")

    /**
     * Цвет машины
     */
    override val color: String = "Ржавый"

    /**
     * Следит за машиной
     */
    override val carOutput: CarOutput
        get() = throw NotImplementedError("Приборов нет")
    override val tankMouth: TankMouth = object : TankMouth() {
        override val width: Int = 5

        override fun open() {
            println("заклинил и не открывается")
        }

        override fun close() {
            println("замок горловины не закрывается")
        }

        override fun toFuel(liters: Int) {
            throw Exception("Бак успешно взорвался")
        }


    }

    /**
     * Получить оборудование
     */
    override fun getEquipment(): String = "Крыса"

    /**
     * Руль вправо на [degrees] градусов
     */
    override fun wheelToRight(degrees: Int) {
        throw NotImplementedError("Руля нет")
    }

    /**
     * Руль влево на [degrees] градусов
     */
    override fun wheelToLeft(degrees: Int) {
        throw NotImplementedError("Руля нет")
    }
}
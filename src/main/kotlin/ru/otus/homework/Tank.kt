package ru.otus.homework

interface Tank {
    val mouth: TankMouth

    fun getContents(): Int
    fun receiveFuel(liters: Int)

}
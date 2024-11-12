package ru.otus.homework

abstract class TankMouth() {

    abstract val width: Int

    abstract fun open()
    abstract fun close()

    abstract fun toFuel(liters:Int)


}
package strategy

abstract class Duck {

    open fun quack() {
        println("quack! quack!")
    }

    fun swim() {
        println("swimming")
    }

    open fun fly() {
        println("I believe i can fly")
    }

    abstract fun display()

}

package strategy

import strategy.behavior.FlyBehavior
import strategy.behavior.QuackBehavior

abstract class Duck {

    lateinit var quackBehavior: QuackBehavior
    lateinit var flyBehavior: FlyBehavior

    fun quack() {
        quackBehavior.quack()
    }

    fun fly() {
        flyBehavior.fly()
    }

    fun swim() {
        println("swimming")
    }

    abstract fun display()

}

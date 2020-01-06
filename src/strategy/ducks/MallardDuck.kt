package strategy.ducks

import strategy.Duck
import strategy.behavior.FlyWithWings
import strategy.behavior.Quack

class MallardDuck : Duck() {

    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("It seems like MallardDuck")
    }
}

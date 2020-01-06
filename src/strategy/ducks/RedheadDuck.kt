package strategy.ducks

import strategy.Duck
import strategy.behavior.FlyWithWings
import strategy.behavior.Quack

class RedheadDuck : Duck() {

    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("It seems like RedheadDuck")
    }
}

package strategy.ducks

import strategy.Duck
import strategy.behavior.FlyNoWay
import strategy.behavior.Squeak

class RubberDuck : Duck() {

    init {
        quackBehavior = Squeak()
        flyBehavior = FlyNoWay()
    }

    override fun display() {
        println("It seems like RubberDuck")
    }
}

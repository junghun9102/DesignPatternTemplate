package strategy.ducks

import strategy.Duck
import strategy.behavior.FlyNoWay
import strategy.behavior.MuteQuack

class DecoyDuck : Duck() {

    init {
        quackBehavior = MuteQuack()
        flyBehavior = FlyNoWay()
    }

    override fun display() {
        println("It seems like DecoyDuck")
    }
}

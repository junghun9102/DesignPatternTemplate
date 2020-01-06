package strategy.behavior

class Squeak : QuackBehavior {
    override fun quack() {
        // 삑! 삑!
        println("squeak! squeak!")
    }
}
package strategy

import strategy.ducks.DecoyDuck
import strategy.ducks.MallardDuck
import strategy.ducks.RubberDuck

/**
 *
 * Scenario
 * 모든 종류의 오리를 클래스로 만드려고 한다.
 * MallardDuck 청둥오리, RedheadDuck 아메리카흰죽지, RubberDuck 고무오리, DecoyDuck 미끼용 모형 오리
 *
 * Problem : 메소드를 변경할 일이 많은 경우 상속의 문제점
 * -> 변경이 많은 코드와 없는 코드를 부분 분리한다. quack, fly / display, swim
 * -> 변경이 많이 일어나는 코드를 캡슐화한다. QuackBehavior, FlyBehavior
 *
 * Definition
 * 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다.
 * 스트래티지를 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.
 *
 */

fun main() {
    val ducks = listOf(MallardDuck(), RubberDuck(), DecoyDuck())

    ducks.forEach {
        it.display()
        it.swim()
        it.quack()
        it.fly()
        println()
    }
}

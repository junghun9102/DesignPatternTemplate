package strategy

/**
 *
 * Scenario
 * 모든 종류의 오리를 클래스로 만드려고 한다.
 * MallardDuck 청둥오리, RedheadDuck 아메리카흰죽지, RubberDuck 고무오리, DecoyDuck 미끼용 모형 오리
 *
 * Problem : 메소드를 변경할 일이 많은 경우 상속의 문제점
 * 날지 못하는 RubberDuck 은 fly 메소드에서 날지 못하도록 override 했다.
 * 날지 못하고 울지 못하는 DecoyDuck 은 fly, quack 메소드에서 아무일을 하지 않도록 override 했다.
 *
 * 만약 계속해서 추가되는 오리들이 날지 못하고 울지 못하면 모두 override 해야 할까?
 *
 * 누가봐도 비효율적이여 보인다.
 * 코드 중복이 생기고 오버라이딩으로 인해 코드가 분산되어 신경 써야할 부분이 많아진다.
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

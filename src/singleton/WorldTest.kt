package singleton

/**
 *
 * 1. World 에는 유일 신만이 존재한다.
 * 2. 마을에서 기도를 하면 신은 축복한다.
 * 3. A 마을과 B 마을이 순차적으로 기도하는 것이 아니라 동시에 기도했다.
 *
 * Problem. singleton 을 사용했음에도 간혹 신이 둘 이상 만들어지는 경우가 생긴다.
 * -> 동기화를 통해 getInstance 에 동시 접근하지 못하도록 한다.
 *
 * Problem. 생성할 때만 조심하면 되는데 사용할 때도 동기화로 인한 성능 저하가 생긴다.
 * -> DCL(Double Checking Locking)을 사용한다.
 * -> null 이 아닌 경우에는 동기화없이 바로 인스턴스를 리턴해준다.
 * -> null 인 경우에만 동기화를 통해 한 개의 인스턴스만 만들 것을 보장한다.
 *
 * Problem. 하지만 자바의 out of order writes 문제로 인해 초기화 되지 않은 인스턴스를 리턴하는 문제가 생길 수 있다.
 * : uniqueInstance = God(count++) 실행에서 God 생성자 전에 uniqueInstance 는 notnull 이 되어 다른 스레드에서 초기화되지 않은 인스턴스를 리턴받을 수 있다고 한다.
 *
 */

fun main() {
    World().run()
}

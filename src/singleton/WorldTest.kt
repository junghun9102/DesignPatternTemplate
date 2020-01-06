package singleton

/**
 *
 * Scenario
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
 * -> 늦은 초기화로 볼 수 있는 메모리 이점은 볼 수 없지만 선언과 함께 초기화를 통해 문제를 해결할 수 있다.
 * -> 또는 getInstance 동기화하고 이로 인한 성능 저하를 양보한다. (Commit 2a6be41e)
 *
 */

fun main() {
    World().run()
}

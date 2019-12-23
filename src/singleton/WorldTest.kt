package singleton

/**
 *
 * 1. World 에는 유일 신만이 존재한다.
 * 2. 마을에서 기도를 하면 신은 축복한다.
 * 3. A 마을과 B 마을이 순차적으로 기도하는 것이 아니라 동시에 기도했다.
 *
 * Problem. singleton 을 사용했음에도 간혹 신이 둘 이상 만들어지는 경우가 생긴다.
 *
 * ATown 과 BTown 에서 동시에 God.getInstance 호출시
 * 두 스레드가 instance 가 null 조건을 통과 후
 * 한 스레드가 인스턴스를 대입 후 리턴, 나머지 스레드 역시 대입 후 리턴할 수 있다.
 *
 * 계속 재실행하다보면 0, 0이 아닌 1, 1 또는 0, 1이 출력하는 것을 볼 수 있다.
 *
 */

fun main() {
    World().run()
}

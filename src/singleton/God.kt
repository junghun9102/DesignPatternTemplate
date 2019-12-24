package singleton

class God private constructor(private val index: Int) {

    companion object {

        /**
         *
         * Volatile : Thread 를 처리중인 CPU cache memory 가 아닌 Main Memory 에 저장
         *            한 개의 스레드에서면 값을 변경하고 대신 나머지 스레드는 항상 최신의 값을 확보할 수 있다.
         *
         */

        @Volatile
        private var uniqueInstance: God? = null

        fun getInstance() = uniqueInstance ?: run {
            synchronized(God) {
                uniqueInstance ?: run {
                    uniqueInstance = God(count++)
                }
                uniqueInstance!!
            }
        }

        private var count = 0
    }

    fun bless(townName: String) {
        println("$index God bless $townName")
    }
}

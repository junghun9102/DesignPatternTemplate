package singleton

class God private constructor(private val index: Int) {

    companion object {

        private var count = 0

        private var uniqueInstance: God = God(count++)

        fun getInstance() = uniqueInstance
    }

    fun bless(townName: String) {
        println("$index God bless $townName")
    }
}

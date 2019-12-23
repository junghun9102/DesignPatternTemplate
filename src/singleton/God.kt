package singleton

class God(private val index: Int) {

    companion object {
        private var uniqueInstance: God? = null

        fun getInstance(): God {
            uniqueInstance ?: run {
                uniqueInstance = God(count++)
            }

            return uniqueInstance!!
        }

        private var count = 0
    }

    fun bless(townName: String) {
        println("$index God bless $townName")
    }
}

package singleton

class Town(private val name: String) {
    fun pray() {
        God.getInstance().bless(name)
    }
}

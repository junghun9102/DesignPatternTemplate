package singleton

class World {
    private val aTown = Town("ATown")
    private val bTown = Town("BTown")

    fun run() {

        Thread {
            aTown.pray()
        }.start()

        Thread {
            bTown.pray()
        }.start()
    }
}

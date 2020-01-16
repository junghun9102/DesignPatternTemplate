package observer

interface Observer<T> {
    fun update(data: T)
}

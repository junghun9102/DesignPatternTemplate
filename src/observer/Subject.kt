package observer

interface Subject<T> {
    val observers: MutableList<Observer<T>>

    fun registerObserver(observer: Observer<T>)
    fun removeObserver(observer: Observer<T>)
    fun notifyObservers()
}

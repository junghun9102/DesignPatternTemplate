package observer

class WeatherData : Subject<WeatherData>{

    override val observers: MutableList<Observer<WeatherData>> = mutableListOf()

    var temperature: Float = 0f
        private set
    var humidity: Float = 0f
        private set
    var pressure: Float = 0f
        private set

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure

        measurementsChanged()
    }

    private fun measurementsChanged() {
        notifyObservers()
    }

    override fun toString() = "t $temperature, h $humidity, p $pressure"

    override fun registerObserver(observer: Observer<WeatherData>) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer<WeatherData>) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(this)
        }
    }

}

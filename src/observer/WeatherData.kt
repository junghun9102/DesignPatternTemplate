package observer

class WeatherData(
    private val weatherBroadcast: WeatherBroadcast,
    private val weatherStatistics: WeatherStatistics
) {

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
        weatherBroadcast.update(this)
        weatherStatistics.update(this)
    }

    override fun toString() = "t $temperature, h $humidity, p $pressure"

}

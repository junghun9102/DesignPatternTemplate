package observer

class WeatherBroadcast(weatherData: Subject<WeatherData>) : Observer<WeatherData> {

    init {
        weatherData.registerObserver(this)
    }

    private lateinit var weatherData: WeatherData

    override fun update(data: WeatherData) {
        this.weatherData = data

        broadcast()
    }

    private fun broadcast() {
        StringBuilder()
            .append("Current Weather is ")
            .append("Temperature(").append(weatherData.temperature).append("), ")
            .append("Humidity(").append(weatherData.humidity).append("), ")
            .append("Pressure(").append(weatherData.pressure).append(")")
            .let(::println)
    }
}

package observer

import java.lang.StringBuilder

class WeatherBroadcast {

    private lateinit var weatherData: WeatherData

    fun update(weatherData: WeatherData) {
        this.weatherData = weatherData

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

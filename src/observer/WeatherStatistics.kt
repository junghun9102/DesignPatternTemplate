package observer

import java.lang.StringBuilder
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.HashMap

class WeatherStatistics(weatherData: Subject<WeatherData>) : Observer<WeatherData> {

    init {
        weatherData.registerObserver(this)
    }

    private val temperatureData: HashMap<Long, Float> = HashMap()
    private val humidityData: HashMap<Long, Float> = HashMap()
    private val pressureData: HashMap<Long, Float> = HashMap()

    override fun update(data: WeatherData) {
        collectData(data)
    }

    private fun collectData(weatherData: WeatherData) {
        val currentTime = System.currentTimeMillis()
        temperatureData[currentTime] = weatherData.temperature
        humidityData[currentTime] = weatherData.humidity
        pressureData[currentTime] = weatherData.pressure

        showCumulativeData()
    }

    private fun showCumulativeData() {
        StringBuilder()
            .append("========== Cumulative Weather Data ==========\n")
            .append("temperature : ").append(temperatureData).append('\n')
            .append("humidity : ").append(humidityData).append('\n')
            .append("pressure : ").append(pressureData).append('\n')
            .let(::println)
    }

}

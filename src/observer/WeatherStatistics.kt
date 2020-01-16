package observer

import java.lang.StringBuilder
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.HashMap

class WeatherStatistics {

    private val temperatureData: HashMap<Long, Float> = HashMap()
    private val humidityData: HashMap<Long, Float> = HashMap()
    private val pressureData: HashMap<Long, Float> = HashMap()

    fun update(weatherData: WeatherData) {
        collectData(weatherData)
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

    private fun getDateStr(time: Long) = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(Date(time))
}

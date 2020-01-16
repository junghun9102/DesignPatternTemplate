package observer

/**
 *
 * Scenario
 * 날씨 데이터를 이용하는 여러 클래스가 있다.
 * 날씨 데이터가 변경될 때 마다 사용하고 있는 클래스에서 즉각 반영하고 싶다.
 *
 * Problem. 현재 코드는 WeatherData 가 사용하는 클래스에 의존성이 강하고 유연성이 떨어진다.
 *  구현체인 사용자들을 객체로 가지고 있다.
 *  추가 사용자를 추가할 때 데이터의 코드도 변경해야 한다.
 *  동적으로 사용자들을 바꿀 수가 없다.
 *
 */

fun main() {

    val weatherForecast = WeatherBroadcast()
    val weatherStatistics = WeatherStatistics()

    val weatherData = WeatherData(weatherForecast, weatherStatistics)

    weatherData.setMeasurements(60f, 60f, 30f)
    weatherData.setMeasurements(70f, 55f, 31f)

}

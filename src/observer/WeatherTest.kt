package observer

/**
 *
 * Scenario
 * 날씨 데이터를 이용하는 여러 클래스가 있다.
 * 날씨 데이터가 변경될 때 마다 사용하고 있는 클래스에서 즉각 반영하고 싶다.
 *
 * Problem. 현재 코드는 WeatherData 가 사용하는 클래스에 의존성이 강하고 유연성이 떨어진다.
 * -> Observer 패턴 사용
 * -> WeatherData 는 더 이상 정확한 사용자들을 알지 못한다.
 * -> 사용하지 않는 사용자는 데이터를 더 이상 안받을 수도 있으며 다시 받을 수도 있다.
 * -> 추가적인 기능 추가로 새로운 사용자가 생겨도 Observer 를 상속하고 등록하여 데이터를 받을 수 있다. WeatherData 코드 변경없이
 *
 * Definition
 * 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테
 * 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다 의존성을 정의합니다.
 *
 */

fun main() {

    val weatherData = WeatherData()

    val weatherForecast = WeatherBroadcast(weatherData)
    val weatherStatistics = WeatherStatistics(weatherData)

    weatherData.setMeasurements(60f, 60f, 30f)
    Thread.sleep(100L)
    weatherData.setMeasurements(70f, 55f, 31f)

    // WeatherForecast stopped forecasting
    weatherData.removeObserver(weatherForecast)
    Thread.sleep(100L)
    weatherData.setMeasurements(71f, 54f, 32f)

}

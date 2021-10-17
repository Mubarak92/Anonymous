fun main() {

    val NationalDayFunction :(String) -> String = {  ruler->
        val nationalDay = 23
        val month = "September "
        "National day of Saudi arabia is in $nationalDay of $month"

    }
    println(NationalDayFunction("King Salman"))
}
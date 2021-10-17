fun main() {

    val NationalDayFunction :(String) -> String = {  month->
        val nationalDay = 23

        "National day of Saudi arabia is in $nationalDay of $month"

    }
    println(NationalDayFunction("September"))
}
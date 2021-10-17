
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    random("september"){month,num ->
        val nationalDay = 23
        println("city number $num")
        println( "National day of Saudi arabia is in $nationalDay of $month")

    }

}
inline fun random(
    month: String,
    cost:(Int) ->
    NationalDay1: (String, Int) -> ) {
    val num = Random.nextInt(1..3) // Randomly selects 1, 2, or 3
    println(NationalDay1(month, num))
}

fun printConstructionCost(num: Int) {
    val cost = 500
    println("construction cost: ${cost * num}")
}
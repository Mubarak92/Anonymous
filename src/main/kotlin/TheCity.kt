
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    var  NationalDay1={month:String,num:Int ->
        val nationalDay = 23
        println("city number $num")
        println( "National day of Saudi arabia is in $nationalDay of $month")

    }
    random("september",NationalDay1)

}
fun random(month: String, NationalDay1: (String, Int) -> Unit) {
    val num = Random.nextInt(1..3) // Randomly selects 1, 2, or 3
    println(NationalDay1(month, num))
}
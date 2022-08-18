import java.util.Scanner
import kotlin.math.ln

fun main(){
    println("Please Enter the size ")
    val n =Scanner(System.`in`).nextInt()
    var counter =0
    val list=ArrayList<String>()
    while (counter < n)
    {
        println("Please Enter the input ")
        val input=Scanner(System.`in`).nextLine()
        list.add(input)
        counter++
    }
    for (item in list){
        if (item.contains('B')||item.contains('M')||item.contains('m')||item.contains('b')){
            println(item.uppercase())
        }
    }

}
import javax.print.attribute.standard.PrinterLocation

fun sum1(n1:Int, n2:Int):Int    //Addition using simple function
{
    return n1 + n2
}
var sum2 = {n1:Int, n2:Int -> Int   //Addition using lamda
    n1+n2

}
fun main()
{
    print("Enter Number 1:")
    val a = readLine()!!.toInt()
    print("Enter Number 2:")
    val b = readLine()!!.toInt()


    println("Addition using simple function.")
    println("$a + $b = ${sum1(a,b)}")

    println("\nAddition using Lamda")
    println("$a + $b = ${sum2(a,b)}")

    val nums = listOf(10,20,30,40,50,60)
    println("Printing list using for loop")
    for(num in nums)
    {
        println(num)
    }
    println("\n Printing list using lamda")
    nums.forEach{num ->
        println(num)
    }



}
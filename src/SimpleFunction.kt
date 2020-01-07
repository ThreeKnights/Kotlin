
fun addNumber(x:Int, y:Int)     //Function with no return
{
    val res = x + y
    println("Addition:$res")
}
fun addMe(x:Int, y:Int):Int
{
    val res = x + y
    return res
}

fun displayInfo(vararg names:String)
{
    for(name in names)
        println("name:$name")
}


fun main()
{
    print("Enter Number 1:")
    val n1 = readLine()!!.toInt()
    print("Enter Number 2:")
    val n2 = readLine()!!.toInt()
    println("\nAddition without return")
    addNumber(n1,n2)

    println("\nAddition with return")
    val add = addMe(n1,n2)
    println("Addition: $add")

    println("\nPrinting names from array")
    displayInfo(names = *arrayOf("Ganesh","Manthan","Rahul"))
}
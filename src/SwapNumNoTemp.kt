fun main()
{
    print("Enter Number 1:")  //Taking num1 from user
    var num1:Int = readLine()!!.toInt()
    print("Enter Numbaer 2:") //Taking num2 from user
    var num2:Int = readLine()!!.toInt()
    println("Before Swapping:") //Printing numbers before swapping
    println("Num 1:$num1 Num 2:$num2")

    num1 += num2
    num2 = num1 - num2
    num1 -= num2

    println("After Swapping:")  //printing numbers after swapping
    println("Num 1:$num1 Num 2:$num2")

}
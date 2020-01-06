fun main()
{
    /*
    print("Enter Choice 1 or 2:")
    val choices = readLine()!!.toInt()
    when(choices)   //when is similar to switch cases from java
    {
        1 ->
        {
            println("You chose 1.")
        }
        2 ->
        {
            println("You chose 2.")
        }
        else ->
        {

            println("You didn't choose 1 or 2.")
        }
    }
    */
    //2nd way of writing when
    // when you have to 
    print("Enter your grades:")
    val grade = readLine()!!.toInt()

    when
    {
        grade >= 75 -> println("A")
        grade in 51..74 -> println("B")
        grade in 31..50 -> println("C")
        else -> println("Fail")
    }
}
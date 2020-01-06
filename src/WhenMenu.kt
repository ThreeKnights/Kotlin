fun main()
{
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
}
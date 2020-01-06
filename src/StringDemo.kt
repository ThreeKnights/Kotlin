fun main()
{
    val msg = " Welcome to Kotlin"
    val name = "Ganesh"
    //val allMsg = name + msg // Concatenating two string
    val allMsg: String = "$name$msg" // Another way on concatenating two strings
    println(allMsg)

    println(allMsg[0])// To get character from specific index

    println(allMsg.toUpperCase())// To convert all the string in Upper Case
    println(allMsg.toLowerCase())// To convert all the string in Lower Case

    println(msg)
    println(msg.trim()) //To remove spaces from the start of string

    val listOfTokens = msg.trim().split(" ") //to split the string in different parts
    // Here string is split by the spaces as condition given above
    for (token in listOfTokens)
    {
        println(token) //printing each split string stored in token
    }

    for (token in listOfTokens)
    {
        if(token.contains("to")) //to check if given string is present in list
            println(token)
    }


}
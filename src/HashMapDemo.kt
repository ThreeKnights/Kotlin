fun main()
{
    //Declaring HashMap
    var listOfUsers = HashMap<Int, String>()
    //Syntax-> var or val variable_name  = HashMap<datatype_of_key, datatype_of_value>()

    listOfUsers[1] ="Manthan"
    listOfUsers[0] = "Ganesh"
    listOfUsers[2] = "Rahul"

    println("${listOfUsers[1]} is very smart")

    //Printing all the elements in HashMap
    for (key in listOfUsers.keys)
    {
        println("Key $key: ${listOfUsers[key]}")
    }
}
import java.util.*
fun main()
{
    //LinkedList is similar to ArrayList but it does not uses array structure
    //LinkedList uses node Structure

    //Declaring LinkedList
    val pet:LinkedList<String> = LinkedList()
    // Syntax-> val or var variable_name:LinkedList<Data_type_of_array> = LinkedList()

    //Accepting values in LinkedList
    do {
        print("Enter Pet Name or type quit to exit:")
        val petName = readLine()!!.toString()
        if(petName != "quit")
            pet.add(petName)
    }while (petName != "quit")

    //to print that LinkedList using index
    println("Print LinkedList using Index")
    for (i in  0 until pet.size)
    {
        println("Pet Name: ${pet[i]}")
    }

    //to print that LinkedList using objects
    println("Print LinkedList Using Objects")
    for (i in  pet)
    {
        println("Pet Name: $i")
    }

    //search element in LinkedList
    println("Searching Element in LinkedList")
    print("Enter pet name to be searched:")
    val petName = readLine()!!
    if(pet.contains(petName))
        println("You have $petName")
    else
        println("You don't have $petName")
}
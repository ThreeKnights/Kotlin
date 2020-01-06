fun main()
{
    //ArrayList is a dynamic array where you don't need to put size of array list
    //If size of the ArrayList is 4 then for the 5th value in ArrayList it doubles the size of itself

    //Declaring ArrayList
    val pet:ArrayList<String> = ArrayList()
    // Syntax-> val or var variable_name:ArrayList<Data_type_of_array> = ArrayList

    //Accepting values in ArrayList
   do {
       print("Enter Pet Name or type quit to exit:")
       val petName = readLine()!!.toString()
       if(petName != "quit")
           pet.add(petName)
   }while (petName != "quit")

    //to print that ArrayList using index
    println("Print ArrayList using Index")
    for (i in  0 until pet.size)
    {
        println("Pet Name: ${pet[i]}")
    }

    //to print that ArrayList using objects
    println("Print ArrayList Using Objects")
    for (i in  pet)
    {
        println("Pet Name: $i")
    }

    //search element in ArrayList
    println("Searching Element in ArrayList")
    print("Enter pet name to be searched:")
    val petName = readLine()!!
    if(pet.contains(petName))
        println("You have $petName")
    else
        println("You don't have $petName")
}
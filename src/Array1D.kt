fun main()
{
    print("Enter Size of Array:")
    val max = readLine()!!.toInt()

    //Declaring Array
    val arr:Array<Int> = Array(max){0}
    // Syntax-> val or var variable_name:Array<Data_type_of_array> = Array(Size_of_Array){Initial values in Array}

    //Accepting values in array
    for (i in 0 until max) //Also equal to 0..max-1
    {
        print("Enter at position $i: ")
        arr[i] = readLine()!!.toInt()
    }

    //to print that array
    for (i in 0 until max) //Also equal to 0..max-1
    {
        println("Value at position $i: ${arr[i]}")
    }
}
fun main()
{
    //Taking values from user

    print("Enter Name:")
    val name = readLine()

    print("Enter Age:")
    //var age = readLine() //In this line the data taken from user is taken as string
    val age = readLine()!!.toInt()  //In this line data taken as String is converted into Integer
                                    //Here "!!" is as null safety meaning the value of variable can not be null

    print("Enter Percentage:")
    val res = readLine()!!.toDouble()   //It is same as accepting Integer values but you will have to define data type like in this line as Double

    println("====User Info====")
    println("Name:$name \nAge:$age \nResult:$res") // printing values taken from user
}
fun main()
{
    //Variables
    //It is not necessary to put datatype while declaring variable. Kotlin can automatically identify the datatype of the variable based on the data stored in variable.
    // 2 ways to define variables

    /*
    //1. when you want to put data in variable in same line
    var str = "Welcome to Kotlin"
    println(str)
    println(str)
    println(str)
    */

    /*
    //2. When you want to put data in variable in next line or later
    var str1:String   // when you wan to put data in next line or in later you must define datatype of that variable
    str1 = "Abc Xyz"
    println(str1)
    println(str1)
    println(str1)
    */

    //Simple Example using variables

    var fname = "Abc"
    var lname:String
    lname = "Xyz"
    var age = 24
    var res = 90.4

    println("******User Info******")
    println("Name:"+fname+" "+lname)
    println("Age:"+age)
    println("Result:$res") //you can also use variable inside double quote  by using $ sign in front of the variable

}
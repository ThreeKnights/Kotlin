fun main()
{
    //Variables
    //It is not necessary to put data type while declaring variable. Kotlin can automatically identify the data type of the variable based on the data stored in variable.
    // 2 ways to define variables

    //1. when you want to put data in variable while declaring
    var str = "Welcome to Kotlin"
    println(str)


    //2. When you want to put data in variable in next line or later
    var str1:String   // when you want to put data in next line or later you must define data type of that variable
    str1 = "Abc Xyz"
    println(str1)


    //Simple Example using variables
    val fname = "Abc"
    val lname:String
    lname = "Xyz"
    val age = 24
    val res = 90.4

    println("******User Info******")
    println("Name:"+fname+" "+lname)
    println("Age:"+age)
    println("Result:$res") //you can also use variable inside double quote by using $ sign as a prefix to variable

    //var vs val
    // Here we use 'var' because when we use 'val' then the value inside val cannot be changed
    // And in 'var' we can change the values more than one time
    var count = 1
    println("Count:$count")
    count++
    println("Count:$count")


    // Null Safety
     // When you want to give variable value as null at the start and later on want to add value in that variable
    var dept:String?  // '?' is used to give variable value as null
    dept = null         //value in variable should defined null even if you want to add value to it later
    dept  = "Computer Engineering"
    println("Department: $dept")
}

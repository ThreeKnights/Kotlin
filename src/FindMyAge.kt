import java.util.*

fun main()
{
    print("Enter You Year of Birth:")
    val yearOfBirth = readLine()!!.toInt() //Take year of birth from user
    val yearOfDevice = Calendar.getInstance().get(Calendar.YEAR) //To get current year from Device
    val age = yearOfDevice - yearOfBirth
    println("You are $age years old") //Printing age of user
}
fun main(){
    print("Enter Number:")
    val n = readLine()!!.toInt()
    if(n%2==0)
        println("Number is Even.")
    else
        println("Number is Odd.")
}
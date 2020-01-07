fun add(n1:Int,n2:Int):Int
{
    println("This is Function 1")
    return n1+n2
}
fun add(n1:Int,n2:Int,n3:Int):Int
{
    println("This is Function 2")
    return n1+n2+n3
}
fun add(n1:Int,n2:Int,n3:Int,n4:Int):Int
{
    println("This is Function 3")
    return n1+n2+n3+n4
}
fun main()
{
    val a = add(12,41)
    println("Addition1:$a")
    val b = add(23,12,14)
    println("Addition2:$b")
    val c = add(13,41,35,73)
    println("Addition3:$c")

}

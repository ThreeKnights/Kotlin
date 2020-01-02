fun main()
{
    var a:Int = 10
    var b:Int = 20
    var c:Int?
    println("Before Swapping:")
    println("a:$a  b:$b") // printing before swapping numbers
    c = a
    a = b  // Swapping numbers
    b = c

    println("After Swapping:")
    println("a:$a  b:$b") // printing Swapped numbers
}
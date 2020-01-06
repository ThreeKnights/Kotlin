fun main()
{
    val isMarried = true
    val gpa = 3.8

    val isQualified:Int?
    if(isMarried == true && gpa >= 3.8)
    {
        isQualified = 1
    }
    else
    {
        isQualified = 0
    }
    println(isQualified)

    //The above code can be simplified using expression given below
    val isQualified1 = if(isMarried && gpa >= 3.8) 1 else 0
    println(isQualified1)

}
fun main()
{
    println("----Continue----")
    for (number in 1..10)
    {
        if (number == 5)
            continue
        println(number)
    }
    println("----Break----")
    for (number in 1..10)
    {
        if (number == 5)
            break   //Used to break the loop
        println(number)
    }

    println("----Another Break Example----")
    for (i in 1..5)
    {
        println("OuterLoop $i")
        for(j in 1..5)
        {
            if (j == 3)
                break
            println("InnerLoop $j")
        }
        println()
    }

    println("----Break Out of Certain Loop----")
    loop1@ for (i in 1..5)
    {
        println("OuterLoop $i")
        for(j in 1..5)
        {
            if (j == 3)
                break@loop1    //To break out of Certain Loop.
            println("InnerLoop $j")
        }
        println()
    }
}
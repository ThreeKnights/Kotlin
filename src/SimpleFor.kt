fun main(){

    //for loop
    println("----Increment----")
    for(i in 1..10){ // A simple For Loop which loops for 10 times
        println("Number $i")
    }
    println("----Incrementing with step 1----")
    for (i in 1..10 step 1 )//here 'step' means for next loop how much value of 'i' is to  be incremented
        println("Number $i")

    println("----Incrementing with step 2----")
    for (i in 1..10 step 2)//Here only odd numbers from 1 to 100 are printed
    {
        println("Number $i")
    }
    println("----Decrement----")
    for(i in 10 downTo 1) // We use 'downTo' when you want to decrement value of i
    {
        println("number $i")
    }


}
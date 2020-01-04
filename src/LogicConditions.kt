/*
> Greater than
< Less then
>= Greater than equal to
<= Less than equal to
== Equal to
!= Not equal to

And Gate (&&)
    True && True =True
    True && False =False
    False && True =False
    False && False =False

OR Gate(||)
    True && True =True
    True && False =True
    False && True =True
    False && False =False

NOT gate (!)
 True =False
 False = True
 */
fun main(){

    val age= 17

    println(age < 30)
    println(age > 30)
    println(age <= 30)
    println(age >= 30)
    println(age == 30)
    println(age != 30)
    println( age in 20..30)  // 'in' is used when you want to compare value in a range
}

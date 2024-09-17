fun fatorial(num: Int): Int{
    var fat = 1;
    for(i in 1..num){
        fat *= i;
    }
    return fat;
}

fun main(){
    println(fatorial(5));
}

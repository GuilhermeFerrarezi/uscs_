fun fatorial(num: Int): Int{
    if (num <= 1){
        return num;
    }else{
        return num * fatorial(num-1);
    }
}

fun main(){
    println(fatorial(5));
}

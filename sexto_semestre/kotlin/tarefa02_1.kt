fun main(){
    var x = 4;
    var a = 15;
    var b = 2;
    var y = 8;

    while(a % b != 0){
        x = a % b;
        y++;
        b = y + x;
        a--;
    }
    var teste = readLine()
    println("y = $y");
}

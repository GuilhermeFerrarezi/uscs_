fun listaQuadrados(num: Int){
    if(num <= 0){
        println("Entre um valor maior que zero");
        return;
    } 
    for(i in 1..num){
        print("${i*i}" + " ");
    }
}

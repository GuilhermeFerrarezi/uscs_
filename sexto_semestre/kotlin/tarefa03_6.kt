fun IMC(peso: Double, altura: Double): Double?{
    if(altura != 0.0){
        return peso / altura;
    }else{
        return null;
    }
}

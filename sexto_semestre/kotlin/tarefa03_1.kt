fun saudacao(nome: String?, idade: Int?): String {
    var retorno = "Olá, " + nome + " ! " + "Você tem " + idade + " anos!";
    if(idade in 18..65) {
        retorno += " Você pode doar sangue ! ";
    }
    return retorno;
}

fun main(){
    var nome: String?;
    var idade: Int?;

    println("Entre com o seu nome: ");
    nome = readLine();

    println("Entre com sua idade: ");
    idade = readLine()?.toIntOrNull();

    val retorno = saudacao(nome, idade);
    println(retorno);
} 

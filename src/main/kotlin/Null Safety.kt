fun main() {
    var str: String? = null
    println(str?.length) // O OPERADOR (?) PEDI AJUDA AO KOTLIN. A PARTIR DAI O KOTLIN IDENTIFICA E ASSUME O ERRO;
    str= "Testando minha string"
    println(str!!.length) // O OPERADOR (!!) INDICA QUE EU VOLTO A ASSUMIR O TRATAMENTO DO ERRO;
    println("Entendendo o Null Safety ")
}
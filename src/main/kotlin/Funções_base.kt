fun Impressao() { // FUNÇÃO SEM PARÂMETRO E SEM RETORNO
    println("Função sem parâmentro e sem retorno")
}
fun Soma(a:Int,b:Int):Int { // FUNÇÃO COM PARÂMETRO E COM RETORNO DO TIPO INTEIRO
    return a+b
}
// --------------------------------------------------------
// PRATICANDO: CRIANDO OUTRAS FUNÇÕES COM OUTROS OPERADORES
fun Subt (c:Int,d:Int):Int {
    return c-d
}
fun Mult (e:Int,f:Int):Int {
    return e / f
}
// ---------------------------------------------------------
fun main() {
    Impressao()
    var x = 30
    var y = 2
    println(Mult(x,y))
}
fun soma_2(a:Int,b:Int){ // FUNÇÃO COM PARÂMENTRO E SEM RETORNO
    println("A soma das variáveis são: ${a+b}")
}
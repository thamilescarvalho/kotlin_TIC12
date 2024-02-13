fun main() {
    var str:String? = null
    // str = "Thamiles"
    if( str == null){
        println("Estrutura convencional indicando uma variável nula")
    }else{
        println(str)
    }
    // OPERADOR ELVIS
    println(str ?: "Estrutura com operador Elvis indicando uma variável nula") // OPERADOR ELVIS = LEMBRA O OPERADOR TERNÁRIO

}
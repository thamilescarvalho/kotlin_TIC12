import javax.print.DocFlavor.CHAR_ARRAY

fun vetor_inteiros() {
    var numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for (i in 0 .. (numeros.size-1)) {
        print("${numeros[i]} ")
    }
    print("\n")
println("Acessando a oitava posição: ${numeros[8]}")
}
fun vetor_inteiros2() {
    var n = Array(size = 10,{i->i})
    for (i in n) {
        print("${n[i]} ")
    }
    print("\n")
}
fun vetor_bool() {
    var b = booleanArrayOf(true,false, true, true, false)
    for (i in 0 ..(b.size-1)) {
        print("${b[i]} ")
    }
    print("\n")
}
fun vetor_str() {
    var txt = arrayOf("Fortaleza", "Santa Catarina", "Rio de Janeiro")
    for (i in 0 .. (txt.size-1)) {
        print("${txt[i]} ")
    }
    print("\n")
    println("Acessando o primeiro elemento: ${txt[0]}")

}
// DESAFIO: CRIAR UM VETOR DO TIPO "CHAR" E UM VETOR DO TIPO "FLOAT"
// CHAR = 'o' // TEXTO de 1 LETRA / FLOAT = 29.03f FRAÇÃO

// CHAR >>

fun vetor_char() {
    val ch = charArrayOf('K', 'O', 'T', 'L', 'I', 'N')
    for (i in 0 .. (ch.size-1)) {
        print("${ch[i]} ")
    }
    print("\n")
}
// FLOAT
fun vetor_float() {
    val ft = floatArrayOf(15.5f, 28.1f, 29.3f, 15.7f)
    for (i in 0 .. (ft.size-1)) {
        print("${ft[i]} ")
    }
}
fun main () {
    vetor_inteiros()
    vetor_inteiros2()
    vetor_bool()
    vetor_str()
    vetor_char()
    vetor_float()
}
import java.util.Scanner
fun ler_int(){
    val scanner = Scanner(System.`in`)
    println("Digite um numero inteiro: ")
    val num = scanner.nextInt()
    println("Você digitou: ${num}")
}
fun ler_double(){
    val scanner = Scanner(System.`in`)
    println("Digite um número Double: ")
    val num = scanner.nextDouble()
    println("Você digitou: ${num}")
}
fun ler_string(){
    val scanner = Scanner(System.`in`)
    println("Digite um nome: ")
    val str = scanner.next()
    println("Você digitou: ${str}")
}
fun ler_float(){
    val scanner = Scanner(System.`in`)
    println("Digite um numero Float: ")
    val num = scanner.nextFloat()
    println("Você digitou: ${num}")
}
fun ler_boolean(){
    val scanner = Scanner(System.`in`)
    println("Digite um valor Booleano: ")
    val num = scanner.nextBoolean()
    println("Você digitou: ${num}")
    scanner.close()
}

fun main() {
    ler_int()
    ler_double()
    ler_float()
    ler_string()
}
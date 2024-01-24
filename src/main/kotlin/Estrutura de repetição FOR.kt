fun main() {
    for(i in 1..10){
        print("${i} ")
    }
    println("\n ") //Quebra de linha
    for(i in 10 downTo 1){
        print("${i} ")
    }
    println("\n ")
    val str = "Residência em TIC 12"
    for( i in str){
        print("${i} ")
    }
    println("\n ")
    for(i in 1 .. 10 step 2){
        print("${i} ")
    }
    println("\n ")
    for(i in 10 downTo 1 step 3){
        print("${i} ")
    }
}
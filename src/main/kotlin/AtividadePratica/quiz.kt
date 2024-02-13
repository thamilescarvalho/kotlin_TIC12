fun main() {
    val vetor = arrayOf(1, 2,3,4,5,6,7,8,9,10)
    for (i in vetor.indices){
        if (vetor[i] % 2 ==1){ continue;
    } else {
        print("${vetor[i]} ")
    }
    }
    val fruits = arrayOf("apple", "banana", "orange", "grape", "watermelon")

    println("Elemento 0" + fruits[0])
    println("Elemento 1" + fruits[1])
    println("Elemento 2" + fruits[2])
    println("Elemento 3" + fruits[3])
    println("Elemento 4" + fruits[4])

    println()
    fun isEven(number: Int): Boolean{
        return  number % 2 == 0 }
    println()
    }


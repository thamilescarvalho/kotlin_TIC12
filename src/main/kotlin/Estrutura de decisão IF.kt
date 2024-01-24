fun main() {
    // Classifique as pessoas através da faixa etária;
    // Idoso = 60 anos acima | Adulto = 21 a 59 | Jovem = 13 a 20 | Criança 12 a baixo;

    //Desafio: Inverter a lógica e começar pela criança

    var idade:Int =27
    if(idade<=12){
        println("Essa pessoa é Criança")
    }else if (idade>=13 && idade<=20){
        println("Essa pessoa é Jovem")
    }else if(idade>=21 && idade<=59){
        println("Essa pessoa é Adulta")
    }
    else{
        println("Essa pessoa é Idosa")
    }

}
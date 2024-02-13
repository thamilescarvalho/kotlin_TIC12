
/*
>>>>> 2 TAREFA:
PROGRAMA QUE RETORNA A SITUAÇÃO DO ALUNO BASEADO NA EM UMA FUNÇÃO QUE CALCÚLA A MÉDIA DE 4 NOTAS

>>>> NOTAS/MATERIAS:
> PORTUGUêS / MATEMÁTICA / CIÊNCIA / BIOLOGIA

>>>> SITUAÇÃO/RESULTADO:
> ( REPROVADO ) < menor que 4
> ( RECUPERAÇÃO ) >= maior ou igual 4 && < menor que 7
> ( APROVADO ) >= maior ou igual 7 && <= menor ou igual 10
> ( NOTA INEXISTENTE ) > maior que 10

*/
fun main() {
    var resultado:Int =7
    if(resultado<4){
        println("REPROVADO")
    }else if (resultado>=4 && resultado<7){
        println("RECUPERAÇÃO")
    }else if(resultado>=7 && resultado<=10){
        println("PARABÉNS!! VOCÊ FOI APROVADO!!")
    }
    else{
        println("NOTA INEXISTENTE")
    }
}
fun main() {
    // BREAK (COM NÚMERO)
    var i=0
       while (1<1000){
           if(i == 20){
               break // PARAR UMA INTERAÇÃO COM BASE EM UMA REQUISIÇÃO LÓGICA
           }
           print("${i} ")
           i++
       }

    print("\n")
    // BREAK (COM LETRA)
    var str = "Teste de Lógica"
    var j=0
        while (j< str.length){
            if(str[j] == 'c'){
                break
            }
            print("${str[j]} ")
            j++
        }
    print("\n")
    // CONTINUE (COM NÚMERO)
    for (i in 0 .. 20){
        if(i%2==1){
            continue
        }
        print("${i} ")
    }
    print("\n")
    // CONTINUE (COM LETRA)
    var str2 = "Thamiles Carvalho"
    for (i in 0 .. (str2.length-1)){
        if(str2[i] == 'e' || str2[i] == 'o'){
            continue
        }
        print("${str2[i]} ")
    }
}
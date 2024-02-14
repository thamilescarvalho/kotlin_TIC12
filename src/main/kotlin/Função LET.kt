fun main() {
    var str:String? = null
    str = "Thamiles"
       if (str!= null){
           println("Caiu no IF")
       }
    str?.let {
        println("Caiu na Função LET")
    }
}
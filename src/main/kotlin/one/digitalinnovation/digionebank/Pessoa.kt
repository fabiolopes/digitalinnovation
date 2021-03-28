package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Bione"
    var cpf: String = "123.123.123-01"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val bione = Pessoa()
    println(bione.pessoaInfo())
}
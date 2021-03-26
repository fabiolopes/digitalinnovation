package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Bione"
    var cpf: String = "123.123.123-01"
    private set
}

fun main() {
    val bione = Pessoa()
    println(bione.nome)
    println(bione.cpf)
}
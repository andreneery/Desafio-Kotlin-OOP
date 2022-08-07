fun main(){
    var andreConta = Account(
        titular = "André",
        conta = 1001,
        saldoInicial = 100.0
    )

    var andreContaPoupança = Account(
        titular = "Andrezinho",
        conta = 1002,
        saldoInicial = 50.0
    )

    andreConta.deposita(100.0);
    println("Depositando valor:")
    println(andreConta.saldo)

    andreConta.saque(50.0)
    println("sacando valor, saldo total: ")
    println(andreConta.saldo)

    andreConta.transferencia(50.0, andreContaPoupança)
    println("valor da conta do André")
    println(andreConta.saldo)
    println("valor da conta poupança")
    println(andreContaPoupança.saldo)

    andreConta.deposita(9_000.0)
    println("valor da conta:")
    println(andreConta.saldo)

    andreContaPoupança.deposita(5000.0)
    println("Valor na conta poupança")
    println(andreContaPoupança.saldo)

    andreContaPoupança.transferencia(1000.0, andreConta)
    println("Transferencia da conta poupança para corrente")
    println("Saldo na conta poupança")
    println(andreContaPoupança.saldo)
    println("valor na conta corrente")
    println(andreConta.saldo)
}
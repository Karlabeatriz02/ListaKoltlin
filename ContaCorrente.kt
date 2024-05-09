 2- class ContaCorrente(var numeroConta:int, var saldo,double){
    fun depositar(valor: Double){
        saldo += valor
    }
    
    fun sacar (valor: Double){
        saldo -= valor
    }

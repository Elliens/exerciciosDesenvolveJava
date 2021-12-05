public class ContaCorrente {
    ContaCorrente(int nroConta){
        this.nroConta = nroConta;
    }

    double saldo;
    int nroConta;
    void deposito(double valor){
        saldo += valor;
    }
    double retirada(double valor){
        double Valor;
        Valor = saldo - valor;
        return Valor;
    }

    double getSaldo(){
        return saldo;
    }

    double getNroConta(){
        return nroConta;
    }
}

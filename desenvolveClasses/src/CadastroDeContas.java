import java.util.*;

public class CadastroDeContas {
    List<ContaCorrente> contaCorrentes= new ArrayList<ContaCorrente>();

    boolean novaContaCorrente(ContaCorrente c){
        try{
            contaCorrentes.add(c);
            return true;
        }
        catch(Exception e){
            return false;
        }

    }

    ContaCorrente getConta(int nroCta) {
        for (ContaCorrente conta : contaCorrentes) {
            if (conta.getNroConta() == nroCta){
                return conta;
            }
        }
        return null;
    }

    double  getSaldoTotal(){
        double saldoTotal = 0;
        for (ContaCorrente conta : contaCorrentes) {
            saldoTotal += conta.getSaldo();
        }
        return saldoTotal;
    }

    int  qtdContas(double  noMinimo){
        int contasNoMinimo = 0;
        for (ContaCorrente conta : contaCorrentes) {
            if (conta.getSaldo() >= noMinimo){
                contasNoMinimo += 1;
            }
        }
        return contasNoMinimo;
    }
}
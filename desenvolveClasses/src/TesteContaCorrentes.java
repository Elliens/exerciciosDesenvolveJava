public class TesteContaCorrentes {
    public static void main(String[] args) {
        CadastroDeContas cadastroDeContas = new CadastroDeContas();



        ContaCorrente contaCorrente_1 = new ContaCorrente(1421);
        contaCorrente_1.deposito(500);
        ContaCorrente contaCorrente_2 = new ContaCorrente(1422);
        contaCorrente_2.deposito(300);
        ContaCorrente contaCorrente_3 = new ContaCorrente(1423);
        contaCorrente_3.deposito(600);
        ContaCorrente contaCorrente_4 = new ContaCorrente(1424);
        contaCorrente_4.deposito(200);
        ContaCorrente contaCorrente_5 = new ContaCorrente(1425);
        contaCorrente_5.deposito(2000);

        System.out.println(cadastroDeContas.novaContaCorrente(contaCorrente_1));
        System.out.println(cadastroDeContas.novaContaCorrente(contaCorrente_2));
        System.out.println(cadastroDeContas.novaContaCorrente(contaCorrente_3));
        System.out.println(cadastroDeContas.novaContaCorrente(contaCorrente_4));
        System.out.println(cadastroDeContas.novaContaCorrente(contaCorrente_5));
        System.out.println(cadastroDeContas.qtdContas(500));
    }
}

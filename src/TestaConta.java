public class TestaConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nomeCompleto = " Maria";
        
        Data hoje = new Data();
        hoje.dia=25;
        hoje.mes=04;
        hoje.ano=2022;

        Conta contaCorrente = new Conta();
        contaCorrente.numero = "12345-6";
        contaCorrente.agencia = "1234";
        contaCorrente.ativa = true;
        contaCorrente.cliente = cliente;
        contaCorrente.dataDeAvertura = hoje;
        contaCorrente.limite = 300;
        contaCorrente.saldo = 100;
        contaCorrente.tipo = "Conta Corrente";



        Conta contaPoupanca = new Conta();
        contaPoupanca.numero = "12345-6";
        contaPoupanca.agencia = "1234";
        contaPoupanca.ativa = true;
        contaPoupanca.cliente = cliente;
        contaPoupanca.dataDeAvertura = hoje;
        contaPoupanca.limite = 0;
        contaPoupanca.saldo = 1000;
        contaPoupanca.tipo = "Conta Poupança";

        if (contaCorrente == contaPoupanca) {
            System.out.println("Contas iguais.");
        } else {
            System.out.println("Contas diferentes.");
        }

        double rendimentoAbril = contaCorrente.calcularRendimentoMensal(0.1);
        System.out.println("O rendimento de abril é de: " + rendimentoAbril);

        System.out.println(contaCorrente.recuperarDadosParaImpressao());

    }
}

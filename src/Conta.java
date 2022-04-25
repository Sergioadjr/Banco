public class Conta {
    double saldo;
    String tipo;
    String numero;
    String agencia;
    double limite;
    boolean ativa;
    Data dataDeAvertura;
    Cliente cliente;

    boolean sacar(double valor) {
        double novoSaldo = this.saldo - valor;
        if (novoSaldo > 0) {
            this.saldo = novoSaldo;
            return true;
        } else {
            System.out.println("Saldo insuficiência");
            return false;
        }
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
        } else {
            this.saldo += valor;
        }
    }

    void transferir(double valor) {
        double novoSaldo = this.saldo - valor;
        this.saldo = novoSaldo;
    }

    void pix(double ValorPIX, Conta contaDestino) {
        if (this.sacar(ValorPIX)) {
            contaDestino.depositar(ValorPIX);
        } else {
            System.out.println("Salvo insuficiente");
        }
    }

    double calcularRendimentoMensal(double taxa) {
        return this.saldo * taxa;
    }

    String recuperarDadosParaImpressao() {
        return "Nome do titular:" + this.cliente.nomeCompleto + "\n" +
                "Ag: " + this.agencia + "\n" +
                "Número da Conta: " + this.numero + "\n" +
                "Data Abertura: " + this.dataDeAvertura.toString() + "\n" +
                "Saldo: " + String.format("%.2f", this.saldo) ;
    }

}

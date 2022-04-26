import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conta {
    private double saldo;
    private String tipo;
    private String numero;
    private String agencia;
    private double limite;
    private boolean ativa;
    private LocalDateTime dataDeAbertura;
    private Cliente cliente;
    private static int contador = 0;

    Conta(Cliente cliente, String agencia, String numero, String tipo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = 0;
        this.ativa = true;
        this.dataDeAbertura = LocalDateTime.now();
        Conta.contador++;
    }

    boolean sacar(double valor) {
        double novoSaldo = this.saldo - valor;
        if (novoSaldo > 0) {
            this.saldo = novoSaldo;
            return true;
        } else {
            mensagemSaldoInsuficiente();
            return false;
        }
    }

    private void mensagemSaldoInsuficiente() {
        System.out.println("Saldo insuficiente");
    }

    void depositar(double valor) {
        if (valor <= 0) {
            mensagemSaldoInsuficiente();
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
            mensagemSaldoInsuficiente();
        }
    }

    double calcularRendimentoMensal(double taxa) {
        return this.saldo * taxa;
    }

    public void aumentarLimite(double valor) {
        this.limite += valor;
    }

    public static int getTotaldeContas() {
        return Conta.contador;
    }

    public String getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getDataDeAbertura() {
        return dataDeAbertura;
    }

    public double getLimite() {
        return limite;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo + this.getLimite();
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    @Override
    public String toString() {
        return "Nome do titular:" + this.cliente + "\n" +
                "Ag: " + this.agencia + "\n" +
                "Número da Conta: " + this.numero + "\n" +
                "Data Abertura: " + this.dataDeAbertura.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" +
                "Saldo: " + String.format("%.2f", this.saldo);
    }

}

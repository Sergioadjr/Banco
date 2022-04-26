import java.time.LocalDate;
import java.time.Month;

public class TestaConta {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(1990, Month.APRIL, 02);
        Cliente cliente = new Cliente("Maria", "210548545", dataNascimento, new Endereco());

        Conta contaCorrente = new Conta(cliente, "1234", "12345-6", "Conta Corrente");
        contaCorrente.depositar(100);

        System.out.println(Conta.getTotaldeContas());
        
        Conta contaPoupanca = new Conta(cliente, "1234", "12345-6", "Conta Poupança");
        contaPoupanca.depositar(100);
        
        System.out.println(Conta.getTotaldeContas());
        
        double rendimentoAbril = contaCorrente.calcularRendimentoMensal(0.1);
        System.out.println("O rendimento de abril é de: " + rendimentoAbril);
        
        System.out.println(contaCorrente);
    }
}

import javax.print.attribute.SupportedValuesAttribute;

public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        conta.agencia = "325-45";
        conta.numero = "12540";
        conta.tipo = "Corrente";
        conta.ativa = true;
        conta.limite = 500d;
        conta.depositar(1000);
        
        Conta novaConta = new Conta();
        novaConta.agencia = "325-45";
        novaConta.numero = "12540";
        novaConta.tipo = "Corrente";
        novaConta.ativa = true;
        novaConta.limite = 100;
        novaConta.depositar(0);
            
        Cliente cliente = new Cliente();
        cliente.nomeCompleto = "Sergio";
        cliente.cpf = "000.111.222-33";
        cliente.dataNascimento = "11/22/33";
        
        Cliente novaCliente = new Cliente();
        novaCliente.nomeCompleto = "joão";
        novaCliente.cpf = "444.555.666-77";
        novaCliente.dataNascimento = "11/44/99";
        
        Endereco endereco = new Endereco();
        endereco.rua = "Rua das Almas";
        endereco.numero = "123";
        endereco.cep = "12345-678";
        endereco.bairro = "Ipê";

        Endereco novaEndereco = new Endereco();
        novaEndereco.rua = "Rua do Corpo";
        novaEndereco.numero = "456";
        novaEndereco.cep = "98765-432";
        novaEndereco.bairro = "Rosa";

        conta.pix(60, novaConta);
        System.out.println("Saldo na conta é: " +  String.format("%.2f", + conta.saldo));
        System.out.println("Saldo na nova conta é: " + String.format("%.2f", + novaConta.saldo));

        System.out.println("Você efetuou o saque, agora possuí: R$" + String.format("%.2f", +conta.saldo));

        cliente.endereco = endereco;
        conta.cliente = cliente;

        System.out.println("O nome do seu Cliente é: " + conta.cliente.nomeCompleto);
        System.out.println("O seu saldo é de: R$ " + String.format("%.2f", conta.saldo));
        System.out.println("O endereço do cliente é na " + endereco.rua + ", nº " + endereco.numero + ", no bairro "
                + endereco.bairro + ", e CEP: " + endereco.cep);
    }
}

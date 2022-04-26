import java.time.LocalDate;

public class Cliente {
    private String nomeCompleto;
    private String cpf;
    private LocalDate dataNascimento;
    private Endereco endereco;

    Cliente(String nomeCompleto, String cpf, LocalDate dataNascimento, Endereco endereco) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    @Override
    public String toString() {
        return "Nome do Titular: " + this.getNomeCompleto() + "\n" +
                "CPF: " + this.getCpf();
    }

}

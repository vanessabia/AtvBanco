package AtvHeranca;

import java.time.LocalDate;
/**
 *
 * @author vanessa
 */
public class PessoaFisica extends Cliente{
    
    private String cpf;
    private String nome;
    private LocalDate nascimento;

    public PessoaFisica(String cpf, String nome, LocalDate nascimento, LocalDate dataCadastro) {
        super(dataCadastro);
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }
}
package AtvHeranca;

import java.time.LocalDate;
/**
 *
 * @author vanessa
 */
public class PessoaJuridica extends Cliente{
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String cnpj, String razaoSocial, LocalDate dataCadastro) {
        super(dataCadastro);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
}
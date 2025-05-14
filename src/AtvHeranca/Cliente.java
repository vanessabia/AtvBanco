package AtvHeranca;

import java.time.LocalDate;
/**
 *
 * @author vanessa
 */
public abstract class Cliente{
    protected LocalDate dataCadastro;

    public Cliente(LocalDate dataCadastro){
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro(){
        return dataCadastro;
    }
    
}



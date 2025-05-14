package AtvHeranca;

/**
 *
 * @author vanessa
 */
public class ContaPoupanca extends Conta{
    
    private double taxaJuros;

    public ContaPoupanca(int numero, double saldo, double taxaJuros, Cliente cliente){
        super(numero, saldo, cliente);
        this.taxaJuros = taxaJuros;
    }

    public void renderJuros(){
        saldo += saldo * taxaJuros;
    }

    public double getTaxaJuros(){
        return taxaJuros;
    }
}
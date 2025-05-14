package AtvHeranca;

import java.time.LocalDate;
/**
 *
 * @author vanessa
 */
public class Main {
    public static void main(String[] args) {
      
        PessoaFisica pf = new PessoaFisica("123.456.789-00", "João da Silva",
                LocalDate.of(1990, 5, 15), LocalDate.now());

        PessoaJuridica pj = new PessoaJuridica("12.345.678/0001-00", "Empresa XYZ LTDA",
                LocalDate.now());

        ContaCorrente ccPf = new ContaCorrente(1, 500.0, 200.0, pf);
        ContaCorrente ccPj = new ContaCorrente(2, 1000.0, 500.0, pj);

        ContaPoupanca cp = new ContaPoupanca(3, 800.0, 0.03, pf);
        
        System.out.println("----------------TESTE CONTA CORRENTE---------------------");
        System.out.println("Saldo Conta Corrente Pessoa Física antes do saque: " + ccPf.getSaldo());
        System.out.println("Saldo Conta Corrente Pessoa Jurídica antes do saque: " + ccPj.getSaldo());
        boolean saque1 = ccPf.sacar(600.0);
        System.out.println("Saque de R$600 realizado? " + saque1);
        System.out.println("Saldo após saque: " + ccPf.getSaldo());

        ccPf.cobrarTaxa();
        System.out.println("Saldo Conta Corrente Pessoa Física após taxa: " + ccPf.getSaldo());

        ccPj.cobrarTaxa();
        System.out.println("Saldo Conta Corrente Pessoa Jurídica após taxa: " + ccPj.getSaldo());

        System.out.println("\n----------------TESTE CONTA POUPANÇA---------------------");
        System.out.println("Saldo da Conta Poupança antes dos juros: " + cp.getSaldo());
        cp.renderJuros();
        System.out.println("Saldo da Conta Poupança após juros: " + cp.getSaldo());

        boolean deposito = cp.depositar(200.0);
        System.out.println("Depósito realizado? " + deposito);
        System.out.println("Saldo Conta Poupança após depósito: " + cp.getSaldo());
    }
    
}


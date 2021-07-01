
package entidades;

public class ContaPoupanca extends Conta {
    
    private Double taxaJuros = 0.01;

    
    public ContaPoupanca() {
    }
    
    //construtor conta Poupança 
    public ContaPoupanca(int numero, String titular) {
        super(numero, titular);
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" + " taxaJuros=" + taxaJuros + ", Titular: " + this.getTitular() + ","
                + " Saldo: " + this.getSaldo()+ '}';
    }
    // método depósito da Conta com sobrescrita;
@Override
    public void deposito (double quantia){
        this.saldo += quantia * (1+this.taxaJuros);
        System.out.println("Depositado: " + quantia + " + " + quantia*this.taxaJuros);
    }
    
    
}


package entidades;

public class Conta {
    
    protected int numero;
    protected String titular;
    protected double saldo;
    
    public Conta (){
        
    }
    public Conta (int numero, String titular){
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void saque (double quantia){
        saldo -= quantia;
    }
        public void deposito (double quantia){
        saldo += quantia;
    }
    
    public void primeiroDeposito(){
        System.out.println("Agora, vamos realizar seu primeiro depósito. \n"
                + "informe a quantia que deseja depositar: ");
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + '}';
    }
        
    
    
}

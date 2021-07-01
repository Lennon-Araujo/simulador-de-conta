
package entidades;

public class ContaEmpresarial extends Conta{
    
    private Double limiteEmprestimo;


    public ContaEmpresarial(int numero, String titular, Double limiteEmprestimo) {
        super(numero, titular);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public ContaEmpresarial() {
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    @Override
    public String toString() {
        return "ContaEmpresarial{ Número da Conta: " + this.getNumero() + ", limiteEmprestimo= " + limiteEmprestimo + ", "
                + "Titular: " + this.getTitular() + ", Saldo: " + this.getSaldo() + '}';  
    }

    
    public void emprestimo (Double valorEmprestimo){
        if (valorEmprestimo <= this.limiteEmprestimo ){
            saldo += valorEmprestimo;
            this.limiteEmprestimo -= valorEmprestimo;
            System.out.println("Empréstimo realizado, o valor de:" + valorEmprestimo + " foi adicionado ao Saldo da sua Conta.");
            System.out.println("Saldo total: " +this.saldo );
        } else {
            System.out.println("Não realizado! \n Seu limite de empréstimo atual é: " + this.limiteEmprestimo);
        }
    }

    @Override
    public void deposito(double quantia) {
        super.deposito(quantia);
        this.limiteEmprestimo += quantia * (0.5);
    }
    
    
    
    
    

    
    
    
}

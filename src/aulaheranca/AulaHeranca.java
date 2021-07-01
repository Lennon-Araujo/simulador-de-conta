package aulaheranca;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;
import java.util.Locale;
import java.util.Scanner;


public class AulaHeranca {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        String titular;
        double quantia = 0;
        double emprestimo = 0;
        int op;
        char cont;

              
        Conta c;
        ContaEmpresarial ce;
        ContaPoupanca cp;
        do{
        System.out.println("Digite apenas o número correspondente a opção desejada: ");
        System.out.println("1 - Conta Fácil");
        System.out.println("2 - Conta Empresarial");
        System.out.println("3 - Conta Poupança");
        
        op = sc.nextInt();
        sc.nextLine();

        switch(op){
            case 1:
        System.out.println("Criar Conta Fácil: "
                + "\n Digite seu nome: ");
        numero += 1;
        titular = sc.nextLine();
        c = new Conta(numero, titular);
        System.out.println("Conta Fácil criada com sucesso!");
        c.primeiroDeposito();
        quantia = sc.nextDouble();
        c.deposito(quantia);
        System.out.println(c.toString());
        break;
        
            case 2:
        System.out.println("Criar Conta Empresarial: "
                + "\n Digite seu nome: ");
        numero += 220;
        titular = sc.nextLine();
        ce = new ContaEmpresarial(numero, titular, emprestimo);
        System.out.println("Conta Empresarial criada com sucesso!"
                + "\n 50% do valor de cada depósito aumenta em seu limite de Empréstimo.");
    
        ce.primeiroDeposito();
        quantia = sc.nextDouble();
        ce.deposito(quantia);
        System.out.println(ce.toString());
        System.out.println("Empréstimo: ");
        emprestimo = sc.nextDouble();
        ce.emprestimo(emprestimo);
        System.out.println(ce.toString());
        System.out.println("Novo depósito: ");
        quantia = sc.nextDouble();
        ce.deposito(quantia);
        System.out.println( ce.getLimiteEmprestimo() );
        
        break;
        
            case 3:
        
     
        System.out.println("Criar Conta Poupança: "
                + "\n Digite seu nome: ");
        numero += 330;
        titular = sc.nextLine();
        cp = new ContaPoupanca(numero, titular);
        System.out.println("Conta Poupança criada com sucesso!"
                + "A cada depósito realizado, receba 1% a mais na sua Conta Poupança");
        cp.primeiroDeposito();
        quantia = sc.nextDouble();
        cp.deposito(quantia);
        System.out.println( cp.toString());
        
        break;
        
            default:
                System.out.println("Não entendi a opção digitada."
                        + "\n Por favor tente novamente.");
 
        }
        
        System.out.println("Tentar novamente? [s/n]");
        cont = sc.next().charAt(0);
        }while (cont == 's' || cont == 'S');
    
        System.out.println("Obrigado pela preferência!");
        
    }

                
}

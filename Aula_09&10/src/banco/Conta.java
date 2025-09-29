package banco;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Conta {
    Cliente cliente;
    private int agencia;
    private int numero;
    private int senha;
    private double saldo;
    private static int totalConta = 1000;

    Scanner ler = new Scanner(System.in);
    Scanner lerS = new Scanner(System.in);

    
    public Conta (Cliente cliente, double saldo, int senha, int agencia) {
    
    	this.cliente = cliente;
		this.agencia = agencia;
		this.saldo = saldo;
		this.senha = senha;
		this.numero = totalConta;
    	
    	totalConta++;
    	
    }
    
    //saldo
    
    private void Saldo() {
    	
    	System.out.println("Digite a senha:");
    	
    	int senha = ler.nextInt();
    	
    	if (this.senha == senha){
    		
    		System.out.println("saldo: " + this.saldo);
    		
    	} else {
    		System.out.println("Senha inválida");
    	}
    	
    	}

  //Saque
    
    public boolean saque(int senha, double valor) {
        boolean confirma = false;
        
        if (this.senha == senha) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque realizado");
                confirma = true;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Senha inválida");
        }

        return confirma;
    }

    //Depósito
    
    private void Depositar(double valor) {
    	
    	
    	System.out.println("Digite o valor que gostaria de depositar: ");
    	
    	if (valor > 0) {
    		
	    	System.out.println("Digite a senha:");
	    	
	    	int senha = ler.nextInt();
    	
		    	if (this.senha == senha){
		    		
		    		this.saldo += valor;
		    		
		    		System.out.println("Deposito realizado. Saldo atual:" + this.saldo);
		    	
		    	} else {
		    		
		    		System.out.println("Senha incorreta");
		    		
		    	}
    	
	    } else {
	    		
	    	System.out.println("Não tem como depositar esse valor");
	    		
	    	}
    }
    

    //Transferência
   
    public void transferencia(int senha, double valor, Conta c) {

    	boolean conf = saque (senha, valor); 
    	
    	if (conf) {
    		c.Depositar(valor);
    		System.out.println("Tranferencia realizada com sucesso");
    	} else {
    		System.out.println();
    	}
    	
    }
    
    public void dadosCliente (int senha) {
    	
    	if(this.senha == senha) {
    		System.out.println("Dados do cliente" + "\n" + "Nome: " + this.cliente.cliente + "\n" + "CPF: " + this.cliente.cpf + "\n" + "Telefone: " + this.cliente.telefone);
    	} else {
    		
    		System.out.println("Senha incorreta");
    		
    	}
    	
    }
    
    


    // Método para exibir as informações da conta
    
}

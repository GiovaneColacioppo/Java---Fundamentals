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

    
    public Conta (Cliente cliente, int numero, double saldo, int senha, int agencia) {
    
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
    
    private void Sacar() {
    	 
    	
    	System.out.println("Digite o valor que gostaria de sacar: ");
    	double valor = ler.nextDouble();
    	
    	if (valor <= this.saldo) {
    		
	    	System.out.println("Digite a senha:");
	    	
	    	int senha = ler.nextInt();
    	
		    	if (this.senha == senha){
		    		
		    		this.saldo -= valor;
		    		
		    		System.out.println("Saque realizado. Saldo atual:" + this.saldo);
		    	
		    	} else {
		    		
		    		System.out.println("Senha incorreta");
		    		
		    	}
    	
	    } else {
	    		
	    	System.out.println("Saldo insuficiente para essa transacao");
	    		
	    	}
    }

    //Depósito
    
    private void Depositar() {
    	
    	
    	System.out.println("Digite o valor que gostaria de depositar: ");
    	double valor = ler.nextDouble();
    	
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
   
    public void transferencia(Cliente c) {

    	
    	
    }
    
    


    // Método para exibir as informações da conta
    
}

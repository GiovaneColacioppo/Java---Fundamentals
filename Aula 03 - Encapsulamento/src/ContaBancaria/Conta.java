package ContaBancaria;

public class Conta {
	
	private String agencia, cliente;
	
	private int  numeroConta, senha;
	
	private double saldo;
	
	private static int ultimaConta = 4545;
	
	public Conta (String agencia, String cliente, double saldo, int senha ) {
		
		this.agencia = agencia;
		this.numeroConta = ultimaConta;
		this.senha = senha;
		this.cliente = cliente;
		this.saldo = saldo;
	
		ultimaConta++;
		
		System.out.println("A conta " + numeroConta + " foi criada com sucesso!");
		
		
	}
	

	public String getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public static int getUltimaConta() {
		return ultimaConta;
	}

	public boolean alterarSenha (int senhaAtual, int novaSenha) {
		
		boolean confirmaSenha = false;
		if(senhaAtual == this.senha) {
			this.senha = novaSenha;
			confirmaSenha = true;
		}
		
		return confirmaSenha;
		
	}
	
	public boolean sacar(double valor, int senha) {
	    if (senha != this.senha) {
	        System.out.println("Senha incorreta.");
	        return false;
	    }

	    if (valor <= 0) {
	        System.out.println("Valor inválido para saque.");
	        return false;
	    }

	    if (valor > saldo) {
	        System.out.println("Saldo insuficiente.");
	        return false;
	    }

	    saldo -= valor;
	    System.out.println("Saque de R$" + valor + " realizado com sucesso.");
	    return true;
	}

	}
	
	


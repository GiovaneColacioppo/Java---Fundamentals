package banco;

public class Cliente {
	
	protected String cliente;
	protected String cpf;
	protected String telefone;
	
	public Cliente(String cliente, String cpf, String telefone, Conta conta) {
        this.cliente = cliente;
        this.cpf = cpf;
        this.telefone = telefone;
    }
	
}

package microsoft;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		
		Funcionario f2 = new Funcionario();
		
		Produto p1 = new Produto(100, "Arroz", 20.50);
		
		
		f1.nome = "Rafael Silva";
		
		f1.cpf = "123.456.789-01";
				
		f1.telefone = "(11) 92345-7894";
		
		
		System.out.println("Nome: " + f1.nome);
		
		System.out.println("CPF: " + f1.cpf);
		
		System.out.println("Telefone: " + f1.telefone);
				
				
		
		
		
		
		
		
		
	}

}

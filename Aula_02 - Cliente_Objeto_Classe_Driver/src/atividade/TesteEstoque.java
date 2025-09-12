package atividade;

public class TesteEstoque {

	public static void main(String[] args) {

		Estoque e1 = new Estoque();
		
		Estoque e2 = new Estoque();
		
		Estoque e3 = new Estoque();

		
		e1.fornecedor = "Friboi";
		
		e1.setor = "Cozinha";
				
		e1.produto = "Coracao de galinha";
		
		e2.produto = "Sobrecoxa";
		
		e3.produto = "File mignon suino";
		
		
		System.out.println("Fornecedor: " + e1.fornecedor + "\nSetor: " + e1.setor + "\nProduto: " + e1.produto + ", " + e2.produto + " e " + e3.produto);
		
		
		Funcionario p1 = new Funcionario ("Rafa","Estoquista","Sabado");
		
		
		
		
	}

}

package microsoft;

public class Produto {

	public int codProduto;
	
	public String nome;
	
	public Double preço;
	
	public Produto (int codProduto, String nome, Double preço) {
		
		this.codProduto = codProduto;
		
		this.nome = nome;
		
		this.preço = preço;
		
		System.out.println("Objeto " + this.nome + " criado com sucesso!");
		
	}

	
}


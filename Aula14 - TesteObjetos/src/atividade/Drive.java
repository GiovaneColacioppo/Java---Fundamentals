package atividade;

public class Drive {

	public static void main(String[] args) {

		Professor p1 = new Professor("Giovane", "Mogi", 343433, 2322222, 20000, 100, 10);
		
		Professor p2 = new Professor("Ismael", "Mogi", 343433, 2322222, 2220, 111, 10);
		
		AcessoSistema as = new AcessoSistema();
		
		as.funcaoSistema(p1);
		
		as.funcaoSistema(p2);
		
	}

}

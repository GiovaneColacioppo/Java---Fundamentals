package banco;

public class TesteSistema {

	public static void main(String[] args) {

		Cadastro CadOper = new Cadastro("Giovane", 400000, 123);
		
		Cadastro CadOper2 = new Cadastro("Oper2", 500000, 456);
		
		Cadastro CadSuper = new Cadastro("Super1", 600000, 789);
				
		Operador o1 = new Operador(1, "Sistemas", 2000, CadOper); 
		
		Operador o2 = new Operador(2, "Maquinas", 1800, CadOper2); 
		
		Supervisor s1 = new Supervisor(3, "Maquina", 2500, CadSuper);
		
		Cliente c1 = new Cliente("Giovane", 4510201, 100);
		
		AcessoSistema si = new AcessoSistema();
		
		System.out.println("--- Teste o1 (Operador com senha 123) ---");
		si.acessoUtil(o1);
		
		
		System.out.println("--- Teste o2 (Operador com senha 456) ---");
		si.acessoUtil(o2); 
		
		System.out.println("--- Teste s1 (Supervisor com senha 789) ---");
		si.acessoUtil(s1); 
		
		System.out.println("--- Teste c1 (Cliente com senha 100) ---");
		si.acessoUtil(c1); 
	}

}
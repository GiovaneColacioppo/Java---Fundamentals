package dependencia2;

public class TesteSistema {

	public static void main(String[] args) {

		Supervisor s1 = new Supervisor ("Abel", 123);
		Supervisor s2 = new Supervisor ("Beta", 456);
		Sistema si = new Sistema();
		Gerente g1 = new Gerente ("Carlos", 789);
		
		si.acessoSistema(s1, 123);
		si.acessoSistema(s2, 456);
		
		si.acessoSistema(g1, 789);
		
	}

}


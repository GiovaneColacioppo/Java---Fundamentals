package dependencia;

public class TesteSistema {

	public static void main(String[] args) {

		Supervisor s1 = new Supervisor ("Abel", 123);
		Supervisor s2 = new Supervisor ("Beta", 456);
		Sistema si = new Sistema();
		
		si.acessoSistema(s1, 123);
		si.acessoSistema(s2, 456);
		
		
	}

}


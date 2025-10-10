package dependenciaInterfaceSistema;

public class TesteSistema {

	public static void main(String[] args) {

		Supervisor s1 = new Supervisor ("Abel", 123, 10000);
		Supervisor s2 = new Supervisor ("Beta", 456, 11000);
		Sistema si = new Sistema();
		Gerente g1 = new Gerente ("Carlos", 789, 20000);
		Tecnico t1 = new Tecnico("Jonathan", 555, 6000);
		
		si.acessoSistema(s1, 123);
		si.acessoSistema(s2, 456);
		
		si.acessoSistema(g1, 789);
		si.acessoSistema(t1, 555);
		
		si.bonoficacaoUtil(s1);
		si.bonoficacaoUtil(s2);
		si.bonoficacaoUtil(g1);
		si.bonoficacaoUtil(t1);
	}

}


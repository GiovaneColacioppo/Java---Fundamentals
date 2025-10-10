package dependencia2;

public class Sistema {

	public void acessoSistema (Supervisor s, int senha) {
		
		s.acesso(senha);
		
	}
	
public void acessoSistema (Gerente g, int senha) {
		
		g.acesso(senha);
		
	}
}

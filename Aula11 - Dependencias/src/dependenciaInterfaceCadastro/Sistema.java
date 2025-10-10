package dependenciaInterfaceCadastro;

public class Sistema {

	public void acessoSistema (AcessoInterface i, int senha) {
		
		i.acesso(senha);
		
	}
	
public void acessoSistema (Gerente g, int senha) {
		
		g.acesso(senha);
		
	}
}

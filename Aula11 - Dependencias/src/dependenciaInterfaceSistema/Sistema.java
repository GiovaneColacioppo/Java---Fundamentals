package dependenciaInterfaceSistema;

public class Sistema {

	public void acessoSistema (AcessoInterface i, int senha) {
		
		i.acesso(senha);
		
	}
	
public void bonoficacaoUtil (AcessoInterface i) {
		
		i.bonificacao();
		
	}
}

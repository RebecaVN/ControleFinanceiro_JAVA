package banco2;

public class LiberaAcesso {
	
	//Criação da senha
	
	private int senha = 223;
	public void AcessarSistema(ConfirmaSenha cs) {
	if(cs.confereSenha(this.senha)) {
	System.out.println("Acesso liberado!");
	}else {
	System.out.println("Acesso negado!");
	}
	}

}

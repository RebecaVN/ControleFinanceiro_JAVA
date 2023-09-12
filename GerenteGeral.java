package banco2;

public class GerenteGeral extends Conta implements
ConfirmaSenha{

	private int senha;
	
	//Construtor da classe
	
	public GerenteGeral(int conta, int agencia, double saldo, Cadastro cliente) {
		super(conta, agencia, saldo, cliente);
	
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
		}

		public boolean confereSenha(int senha) {
		if(this.senha == senha) {
		return true;
		}else {
		return false;
		}
		}

}

package banco2;

public class GerenteDeTI extends Conta implements ConfirmaSenha {

	//Variavel da senha
	
	private int senha;
	
	//Construtor da classe

	public GerenteDeTI(int conta, int agencia, double saldo, Cadastro cliente) {
		super(conta, agencia, saldo, cliente);

	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean confereSenha(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}

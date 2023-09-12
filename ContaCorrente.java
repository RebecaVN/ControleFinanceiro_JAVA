package banco2;

//Classe Conta Do Banco

public class ContaCorrente extends Conta {
	
	//Construtor da classe

	public ContaCorrente(int conta, int agencia, double saldo, Cadastro cliente) {
		super(conta, agencia, saldo, cliente);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean saca(double valor) {
	double valorSaca = valor + 5.0;
	return super.saca(valorSaca);
	}

}

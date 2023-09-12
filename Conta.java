package banco2;

// Classse abstrata para gerar conta
public abstract class Conta {
	private int conta;
	private int agencia;
	private double saldo;
	Cadastro cliente;
	
// Construtor da classe	

	public Conta(int conta, int agencia, double saldo,
	Cadastro cliente) {

	this.conta = conta;
	this.agencia = agencia;
	this.saldo = saldo;
	this.cliente = cliente;
	}
// Gerando GETTERS e SETTERS
	
	public int getConta() {
	return conta;
	}

	public void setConta(int conta) {
	this.conta = conta;
	}

	public int getAgencia() {
	return agencia;
	}

	public void setAgencia(int agencia) {
	this.agencia = agencia;
	}

	public double getSaldo() {
	return saldo;
	}
	
	// Método deposito
	public void deposito(double valor) {
	this.saldo += valor;
	}
	
	//Método saque
	public boolean saca(double valor) {
	if(this.saldo >= valor) {
	this.saldo -= valor;
	return true;
	}else {
	return false;
	}
	}

	//Método trsanfere
	
	public boolean transfere(double valor, Conta destino) {
	if(this.saca(valor)) {
	destino.deposito(valor);
	return true;
	}else {
	return false;
	}
	}
	}



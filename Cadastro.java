package banco2;

	// Classe para cadastro de cliente
public class Cadastro {
	
	//Variaveis de cadastro
	
	private String cliente;
	private String cpf;
	private String telefone;
	private double rendaBruta;
	
	// Construtor da classe

	public Cadastro(String nome, String cpf, String telefone, double rendaBruta) {

		this.cliente = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rendaBruta = rendaBruta;
	}
	
	//Gerando GETTERS e SETTERS 

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCpf() {

		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

}

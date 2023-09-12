package banco2;

public class TesteSistema {
	public static void main(String[] args) {
		
		//Criando Cadastro dos gerentes
		
		Cadastro cad2 = new Cadastro("Rodrigo Dallas",

		"123.123", "(11)91234-1234", 20000.0);

		Cadastro cad3 = new Cadastro("Cleiton Ferraz",

		"123.124", "(11)91234-1235", 20000.0);

		GerenteGeral gG1 = new GerenteGeral(111, 100, 20000,

		cad2);

		GerenteDeTI gTI = new GerenteDeTI(111, 100, 30000,

		cad3);
		
		//Teste  de acesso com as senhas
		
		gG1.setSenha(222);

		gTI.setSenha(223);
		
		LiberaAcesso la = new LiberaAcesso();
		System.out.println(gG1.cliente.getCliente() + ". ");
		la.AcessarSistema(gG1);
		System.out.println();
		System.out.println(gTI.cliente.getCliente() +". ");
		la.AcessarSistema(gTI);
		}

}

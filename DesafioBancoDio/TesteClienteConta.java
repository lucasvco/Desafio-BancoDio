
public class TesteClienteConta {
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Lucas V.");
		c1.setCpf("111.111.111-11");
		c1.setEndereco("Rua 13, 01");
		c1.setProfissao("Desenvolvedor");
		
		Cliente c2 = new Cliente();
		c2.setNome("Luiza A.");
		c2.setCpf("222.222.222-22");
		c2.setEndereco("Rua 25, 03");
		c2.setProfissao("Medica");
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1);
		conta1.setNumero(111);
		conta1.setTitular(c1);
		
		Conta conta2 = new Conta();
		conta2.setAgencia(1);
		conta2.setNumero(112);
		conta2.setTitular(c2);
		
		conta1.depositar(900);
		conta1.transferir(400, conta2);
		conta1.imprimirInfosComuns();
		conta2.imprimirInfosComuns();
	}

}

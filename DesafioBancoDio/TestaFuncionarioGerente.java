
public class TestaFuncionarioGerente {

	public static void main(String[] args) {
		//Criando funcionario comum
		Funcionario f1 = new Funcionario();
		f1.setNome("Jaime O.");
		f1.setCpf("777.777.777-77");
		f1.setSalario(3000);
		
		f1.imprimirInfosFuncionarios();
		
		//Criando gerente com herança de Funcionario
		Gerente g1 = new Gerente();
		g1.setNome("Carlos M.");
		g1.setCpf("888.888.888-88");
		g1.setSalario(5000);
		g1.setSenha(1985);
		
	    g1.imprimirInfosFuncionarios();
		System.out.println(g1.autentica(2004));
		

	}

}

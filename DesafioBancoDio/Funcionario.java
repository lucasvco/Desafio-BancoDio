
public class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	
	//Metodo de bonus comum para qualquer funcionario
	public double getBonus() {
		return this.salario  * 0.2;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	protected void imprimirInfosFuncionarios() {
		System.out.println(String.format("Nome: %s", this.nome));
		System.out.println(String.format("CPF: %s", this.cpf));
		System.out.println(String.format("Salario: %2f", this.salario));
		System.out.println(String.format("Bonus: %.2f", this.getBonus()));
		
	}

}
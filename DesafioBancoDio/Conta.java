
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta() {
		Conta.total++;
		System.out.println("O total de contas é " + total);
	}

	
	public void depositar(double valor) {
		this.saldo += valor;		
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.sacar(valor);
			destino.depositar(valor);
			return true;
		}else {
			return false;
		}
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.titular.getNome()));
		System.out.println(String.format("Titular: %s", this.titular.getCpf()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}

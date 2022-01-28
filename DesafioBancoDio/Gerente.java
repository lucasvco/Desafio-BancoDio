
public class Gerente extends Funcionario {
	
	//Senha e metodo de autenticar senha especificos de gerente
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
    
    //Metodo de bonus especifico para gerente
    public double getBonus() {
		return super.getBonus() + super.getSalario();
	}

}
package albergonibank_herdado;


//extends é usado para herdar atributos da classe funcionario
public class Gerente extends Funcionario {
	
	 
	 private int senha;
	 
	 
	 
	 public void setSenha(int senha) {
		this.senha = senha;
	}
	 
	 
	 public Gerente() {
			
			
		}
		  
	 
	public boolean autentica(int senha) {
		
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
	 
	 
	//public double getBonificacao() {
		//return this.salario;	
	//} 
	 
	
	 
	 

}

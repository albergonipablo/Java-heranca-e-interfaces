package albergonibank_herdado;


//extends é usado para herdar atributos da classe funcionario
//Gerente da vida ao autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		
		this.autenticador = new AutenticacaoUtil();
		
	} 
	
	
	public double getBonificacao() {
		return super.getSalario();	
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}
	 
	
	 
	 

}

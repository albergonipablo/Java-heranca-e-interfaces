package albergonibank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente pablo = new Gerente();
		
		pablo.setNome("Pablo Albergoni");
		pablo.setCpf("447.998.438.00");
		pablo.setSalario(1000);
		
		System.out.println("O nome é : " + pablo.getNome());
		System.out.println("A bonificação é : " + pablo.getBonificacao() );
		
	
		
		
	}

}

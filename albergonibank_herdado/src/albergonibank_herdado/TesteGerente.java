package albergonibank_herdado;

public class TesteGerente {

	public static void main(String[] args) {


		Gerente g1 = new Gerente();
		
		g1.setNome("Pablo");
		g1.setCpf("447.998.438.00");
		g1.setSalario(5000.0);
		
		System.out.println("Nome:" + g1.getNome());
		System.out.println("Cpf:" + g1.getCpf());
		System.out.println("Salario:" + g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}

}

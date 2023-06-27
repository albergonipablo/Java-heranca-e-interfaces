package albergonibank_herdado;

public class TesteReferencias {

	public static void main(String[] args) {
		
		
		//definimos usuario pois é generico mas do lado direito sempre o especifico.
		Funcionario g1 = new Gerente();
		g1.setNome("Pablinho");
		g1.setSalario(5000.0);
		
		
		Funcionario ev = new EditorVideo();
		ev.setSalario(2500.0);
		//todos são funcionarios, só muda o cargo, por isso o metodo especifico será chamado
		//dependendo da referencia no caso acima editorvideo.
		
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
		
		//a real vantagem do polimorfismo neste caso é sempre chamar o metodo de bonificação
		//correto independente do cargo, pois todos são funcionarios, com isso evitamos reescrita
		//de codigo e conseguimos separar os metodos de cada um.
		
	}

}

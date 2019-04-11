package aulaObserver;

public class Gerente implements Observador {
	// o gerente que est� observando, ele precisa ser avisado quando algu�m faltar
	Observado obs;
	public Gerente(Observado obs) {
		// construtor, vai pegar o objeto observador, neste caso o programador
		// e vai adicionar a lista de observadores
		this.obs = obs;
		this.obs.addObserver( this );
		
	}
	
	
	
	@Override
	public void update(String presenca) {
		// TODO Auto-generated method stub
		// o funcionario mudou de status
		// vamos considerar que a mudan�a � falta
		if (presenca.equals("p")) {
			System.out.println("Opa funcionario presente! tudo certo");
		}else {
			System.out.println("Eita, um funcionario faltou, tenho que rever o cronograma");
		}
		
	}
	
	
	
}

package aulaObserver;

public class RH implements Observador{
	Observado obs;
	
	
	public RH(Observado obs) {
		// construtor, vai pegar o objeto observador, neste caso o programador
		// e vai adicionar a lista de observadores
		this.obs = obs;
		this.obs.addObserver( this );
		
	}
	
	@Override
	public void update(String presenca) {
		//semelhante ao coment�rio da classe gerente
		if (presenca.equals("p")) {
			System.out.println("Opa funcionario presente! vai assinar a folha de ponto");
		}else {
			System.out.println("Opa, um funcion�rio faltou, vou botar falta no ponto");
		}
		
		
		
		
	}
	// assim como o gerente, o rh � o observador, ele precisa ser avisado

}

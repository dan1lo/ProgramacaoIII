package aulaObserver;

import java.util.ArrayList;
import java.util.List;

public class Programador implements Observado {
	// o programador � que precisa ser observado
	private List<Observador> listaObservadores; /* NOSSAS ENTIDADES OBSERVADORAS EST�O AQUI */
	
	private String presenca;
	
	public Programador() {
		//construtor para quando iniciar a classe ter a lista de observadores
		listaObservadores = new ArrayList<>();
	}
	
	
	public void setPresenca(String p) {
		
		 this.presenca = p;
		 notifyObservers(p); //chamo o metodo notify aqui e passo o status do funcionario
		 
	}


	@Override
	public void addObserver(Observador observer) {
		// adiciono um observador na lista
		listaObservadores.add(observer);
		
	}


	@Override
	public void removeObserver(Observador observer) {
		// aqui eu vou remover algum observador da lista caso eu n�o deseje ele mais observando
		// tenho que verificar se ele t� ou na dentro da lista
		int index = listaObservadores.indexOf( observer );
        if( index > -1 ){
            listaObservadores.remove( observer );
        }
		
	}


	@Override
	public void notifyObservers(String p) {
	
		// aqui � onde toda a m�gica acontece
		// a gente tem uma lista de observadores
		// todos os observadores tem um m�todo update
		// como todos os observadores est�o dentro da lista
		// este metodo, ao ser chamado, executa todos os metodos updates em todas as classes que temos observando
	
		for( Observador o :listaObservadores ){
            o.update(p);
        }
		
	}
	
	

}

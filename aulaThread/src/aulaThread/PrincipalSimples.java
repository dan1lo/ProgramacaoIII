package aulaThread;

public class PrincipalSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSimples td = new ThreadSimples("Thread 1", 1); // faço uma instancia de 1 aqui a thread é nova dentro do ciclo de vida,
		//e vai para o estado de pronto
		ThreadSimples td2 = new ThreadSimples("Thread 2", 2); // mesmo comentário anterior só que com outro objeto
		
		td.start(); // aqui eu uso o metodo start, este metodo inicia o metodo run da thread
		td2.start();

	}

}

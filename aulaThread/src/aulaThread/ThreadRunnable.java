package aulaThread;

public class ThreadRunnable implements Runnable{
	// Como java nao permite heran�a multipla
	//temos que criar a interface runnable se quiser possibilitar herdar a classe
	// ela vai ser igual a ThreadSimples, a �nica diferen�a � como instanciar na classe principal e n�o tem o metodo getName
    
	private int tempo;
	private String nome;
	
	public ThreadRunnable(String str, int tempo) {
		this.nome = str; // como n�o temos o metodo getNome eu tive que criar
        this.tempo = tempo; // estou preenhcendo automaticamente o tempo
    } // construtor para dar o nome a nossa thread
	
	
	public String getName() {
		
		return this.nome;
	}
	
	
	// aqui come�a nossa thread
    public void run() {
        for (int i = 0; i < 10; i++) {
        	System.out.println("A "+ getName() + " est� acordada");
            System.out.println(getName() + " est� na posi��o :" + i );
            try {
                Thread.sleep((long)( this.tempo * 1000)); // eu estou colocando a classe para dormir
                //aqui a linha de excu��o t� bloqueada
                
                System.out.println("A "+ getName() + " est� dormindo");
            } catch (InterruptedException e) {}
        }
        System.out.println("A thread " + getName() + " acabou"); 
        // aqui a thread t� encerrada (terminada)
    }

}

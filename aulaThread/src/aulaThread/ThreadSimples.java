package aulaThread;

public class ThreadSimples extends Thread {
	private int tempo;
	
	public ThreadSimples(String str, int tempo) {
        super (str);
        this.tempo = tempo; // estou preenhcendo automaticamente o tempo
    } // construtor para dar o nome a nossa thread
	
	
	
	// aqui come�a nossa thread
    public void run() {
        for (int i = 0; i < 10; i++) {
        	System.out.println("A "+ getName() + " est� acordada");
            System.out.println(getName() + " est� na posi��o :" + i );
            try {
                Thread.sleep( this.tempo * 1000); // eu estou colocando a classe para dormir
                //aqui a linha de excu��o t� bloqueada
                System.out.println("A "+ getName() + " est� dormindo");
            } catch (InterruptedException e) {}
        }
        System.out.println("A thread " + getName() + " acabou"); 
        // aqui a thread t� encerrada (terminada)
    }
}


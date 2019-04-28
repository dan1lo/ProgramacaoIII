package aulaThread;

public class ThreadSimples extends Thread {
	private int tempo;
	
	public ThreadSimples(String str, int tempo) {
        super (str);
        this.tempo = tempo; // estou preenhcendo automaticamente o tempo
    } // construtor para dar o nome a nossa thread
	
	
	
	// aqui começa nossa thread
    public void run() {
        for (int i = 0; i < 10; i++) {
        	System.out.println("A "+ getName() + " está acordada");
            System.out.println(getName() + " está na posição :" + i );
            try {
                Thread.sleep( this.tempo * 1000); // eu estou colocando a classe para dormir
                //aqui a linha de excução tá bloqueada
                System.out.println("A "+ getName() + " está dormindo");
            } catch (InterruptedException e) {}
        }
        System.out.println("A thread " + getName() + " acabou"); 
        // aqui a thread tá encerrada (terminada)
    }
}


package aulaThread;

public class ThreadRunnable implements Runnable{
	// Como java nao permite herança multipla
	//temos que criar a interface runnable se quiser possibilitar herdar a classe
	// ela vai ser igual a ThreadSimples, a única diferença é como instanciar na classe principal e não tem o metodo getName
    
	private int tempo;
	private String nome;
	
	public ThreadRunnable(String str, int tempo) {
		this.nome = str; // como não temos o metodo getNome eu tive que criar
        this.tempo = tempo; // estou preenhcendo automaticamente o tempo
    } // construtor para dar o nome a nossa thread
	
	
	public String getName() {
		
		return this.nome;
	}
	
	
	// aqui começa nossa thread
    public void run() {
        for (int i = 0; i < 10; i++) {
        	System.out.println("A "+ getName() + " está acordada");
            System.out.println(getName() + " está na posição :" + i );
            try {
                Thread.sleep((long)( this.tempo * 1000)); // eu estou colocando a classe para dormir
                //aqui a linha de excução tá bloqueada
                
                System.out.println("A "+ getName() + " está dormindo");
            } catch (InterruptedException e) {}
        }
        System.out.println("A thread " + getName() + " acabou"); 
        // aqui a thread tá encerrada (terminada)
    }

}

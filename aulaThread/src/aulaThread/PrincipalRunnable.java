package aulaThread;

public class PrincipalRunnable {
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//aqui ta a diferença, eu preciso instanciar runnable
		ThreadRunnable thrun = new ThreadRunnable ("TH RUN 1 ", 1);
		// para depois instaciar a thread
		Thread td = new Thread(thrun);
		td.start();	
		
		
		
		
	}

	
}

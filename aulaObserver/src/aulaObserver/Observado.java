package aulaObserver;

public interface Observado {
	    public void addObserver(Observador observer);
	    public void removeObserver(Observador observer);
	    public void notifyObservers(String p);
	    
	}



package aulaClasseInterna;

public class ClasseAnonima {
	
	public void texto() {
		
		System.out.println("Texto da classe anonima");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClasseAnonima anonima = new ClasseAnonima() {
			public void texto() {
				System.out.println("texto diferente");
			}
			
		};
		
		anonima.texto();
	}

}

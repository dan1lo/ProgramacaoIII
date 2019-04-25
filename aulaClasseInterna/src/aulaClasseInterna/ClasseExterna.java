package aulaClasseInterna;

public class ClasseExterna {
	
	private String texto ="texto externo";

	
	public class ClasseInterna{
		
		private String texto ="Texto interno";
		public void imprime()
		{
			System.out.println(texto);
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClasseExterna externa = new ClasseExterna();
		ClasseInterna interna = externa.new ClasseInterna();
		
		interna.imprime();
		
	}

	
}

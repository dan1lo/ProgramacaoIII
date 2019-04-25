package teste;

import java.util.ArrayList;

public class RevisaoProva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listaNomes = new ArrayList<String> ();

		listaNomes.add("raquel");
		listaNomes.add("Danilo");
		listaNomes.add("Ze");
		
		listaNomes.remove("Ze");
		for (String nome: listaNomes ) {
			System.out.println(nome);			
		}
		
	}

}

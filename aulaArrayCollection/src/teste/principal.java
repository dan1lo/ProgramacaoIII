package teste;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sair = 1;
		ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa> ();	
		Scanner ler = new Scanner(System.in);
		while (sair!=0) {
			System.out.println("Deseja cadastrar uma pessoa? 1- para sim e 0 -para nao ");
			sair = ler.nextInt();
			if (sair != 0 ) {
				System.out.println("Digite o nome:");
				String nome = ler.next();
				System.out.println("Digite a idade:"); int idade = ler.nextInt();
				Pessoa p = new Pessoa(nome, idade); listaPessoa.add(p);
				 
				
			}
			
		}
		
		  for(int i=0;i<listaPessoa.size();i++){
		  System.out.println(listaPessoa.get(i).getNome()); }
		  // maneira 1 de fazer, menos elegante
		  // criei um for para percorrer o arraylist de lista pessoa até o tamanho dele, em cada interação eu  pego cada objeto (i)
		  // e assim posso utilizar pegar o nome de cada objeto com o getNome
		  
		  
		  
		  for(Pessoa pessoa : listaPessoa) { System.out.println(pessoa.getIdade()); }
		 //maneira usando iterator, mais elegante
		  // eu declaro uma variavel pessoa por ela ser do tipo do objeto que está em lista pessoa, e depois uso : listaPessoa
		  // é como se eu falasse para cada objeto pessoa da listaPessoa faça o que tá dentro de {}, neste caso, pegue a pessoa.getIdade()
		 //
		  
		  
	}

}

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
				
				System.out.println(nome);
				
				  Pessoa p = new Pessoa(nome, idade); listaPessoa.add(p);
				 
				
			}
			
		}
		
		  for(int i=0;i<listaPessoa.size();i++){
		  System.out.println(listaPessoa.get(i).getNome()); }
		  
		  
		  for(Pessoa pessoa : listaPessoa) { System.out.println(pessoa.getNome()); }
		 
	}

}
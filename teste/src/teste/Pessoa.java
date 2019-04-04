package teste;

public class Pessoa {
	
	private int idade;
	private String nome;
	
	
	public Pessoa(String pnome, int pidade ) {
		
		this.nome = pnome;
		this.idade = pidade;
		
		
	}
	
	public String getNome() {
		
		return this.nome;
		
	}
	
	public int getIdade() {
		
		return this.idade;
	}
	
	

}

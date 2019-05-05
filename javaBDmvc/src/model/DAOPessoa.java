package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DAOPessoa {
	//esta classe é para inserir no banco
	
	Bd bd;
	// aqui eu instacio bd
	// bd eu tenho as configuraçoes para acessar o banco
	
	Connection c = null;
	private PreparedStatement stmt;
	
	public DAOPessoa(){
		this.bd = new Bd();
		// aqui eu instancio bd
		// bd eu tenho as configuraçoes para acessar o banco
		
	}
	
	public void inserir (Pessoa p) {
			
		try {
			c = bd.startBanco(); // aqui eu starto o banco
			// para mais informacoes olhar a classe Bd
			
			if(c!=null) {
				// se tiver um retorno em bd.startBanco... se não estiver null...
				c.createStatement(); 
				// aqui eu digo ao banco que vou "usa-lo"
				// meio que eu digo que se prepara ai que vamos sair
				stmt = c.prepareStatement("INSERT INTO pessoas(nome) VALUES(?)");
				// aqui eu preparo a query que desejo usar
				this.stmt.setString(1, p.getNome());
				// aqui eu estou dizendo que o primeiro parametro(nome)
				// vai receber o valor que estiver no objeto p
				stmt.execute();
				// aqui eu realmente executo a query
				stmt.close();
				//aqui eu fecho, digo ao banco que nao precisar me esperar mais
				c.close();
				// aqui eu fecho toda a conexao com o banco
				
				//aqui vc volta para a classe Controller pessoa
				
			}
			
		}catch(Exception e){
			
			  e.printStackTrace();
		       System.err.println(e.getClass().getName()+": "+e.getMessage());
		       System.exit(0);
		}
		
		
	}
	

}

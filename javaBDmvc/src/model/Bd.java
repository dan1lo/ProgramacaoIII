package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Bd {
	
// esta classe é para startart o banco 
// aqui fica os arquivos de configuraçoes	
Connection c = null;
	
 public Connection startBanco() {
	// lembrando que tem que adicionar ao path a jar do postgre
     // botao direto no projeto
	 /* build path
	  * add libraries
	  *  next, crie um nome, adicione uma lib e importe o arquivo 
	  *  https://jdbc.postgresql.org/download.html
	  */
	 try {
	       Class.forName("org.postgresql.Driver");// digo qual é o driver
	       Connection c = DriverManager
	          .getConnection("jdbc:postgresql://localhost:5432/aulaJava",
	          "postgres", "12345");
	       
	       //passo as configuraçoes para se conectar ao banco
	        
	       
	        return c;
	        // aqui voce volta para a DAOPessoa
	        
	    } catch (Exception e) {
	       e.printStackTrace();
	       System.err.println(e.getClass().getName()+": "+e.getMessage());
	       System.exit(0);
	      
	    }
	    System.out.println("Opened database successfully");

	    return c;
	 

 }
}
    
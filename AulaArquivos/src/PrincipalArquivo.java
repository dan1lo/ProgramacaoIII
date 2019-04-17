import java.io.File;
import java.io.IOException;

public class PrincipalArquivo {

	public static void main(String[] args) {
		
		
		File arquivo = new File("p3.txt");
		 // este comando prepara para criar o arquivo p3.tx
		// eu poderia também colocar o caminho da pasta usando ... File("C:\\pasta\\nome.txt
		
		
		try {
			arquivo.createNewFile();
			System.out.println("Arquivo criado");
			// este comando cria um novo arquivo na pasta do projeto
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(" Deu problema ao criar um arquivo");
			e.printStackTrace();
		}
		
		if( ! arquivo.exists() ){
		    System.out.println("o arquivo nao existe");
		} else {
			
			System.out.println("Arquivo já existe");
		}

	
	}
}

import java.io.File;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		
		
		File arquivo = new File("p3.txt");
		 // este comando prepara para criar o arquivo p3.tx
		// eu poderia também colocar o caminho da pasta usando ... File("C:\\pasta\\nome.txt
		
		
		try {
			arquivo.createNewFile();
			// este comando cria um novo arquivo na pasta do projeto
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if( ! arquivo.exists() ){
		    System.out.println("até aqui não foi criado um arquivo");
		} else {
			
			System.out.println("Arquivo criado");
		}

	}

}

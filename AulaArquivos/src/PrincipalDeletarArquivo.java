import java.io.File;
import java.io.IOException;
public class PrincipalDeletarArquivo {
	public static void main(String[] args) {
		File arquivo = new File("arquivo_deletar.txt");
		try {
			arquivo.createNewFile();
			System.out.println("Arquivo criado");
		} catch (IOException e) {
			System.out.println(" Deu problema ao criar um arquivo");
			e.printStackTrace();
		}		
		if( ! arquivo.exists() ){
		    System.out.println("o arquivo nao existe");
		} else {
			System.out.println("Arquivo já existe");
		}
		if( arquivo.delete() ){ // comando para deletar um arquivo
			System.out.println("O arquivo foi deletado");
		}else{
		    System.out.println("O arquivo não foi deletado");
		}
		
		if( ! arquivo.exists() ){//verifico se ele existe novamente
		    System.out.println("o arquivo nao existe");
		} else {
			
			System.out.println("Arquivo já existe");
		}

	}

}

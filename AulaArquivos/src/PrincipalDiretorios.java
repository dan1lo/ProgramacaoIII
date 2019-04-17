import java.io.File;
import java.io.IOException;

public class PrincipalDiretorios {
	public static void main(String[] args) {
		// podemos criar diretorios tamb�m
		// 
		File diretorio = new File( "novo"); // dou o nome do diretorio e o caminho, neste caso t� dentro
		// da pasta do projeto
		if( diretorio.mkdir() ){
		    System.out.println("Diret�rio criado");
		}else{
		    System.out.println("Diret�rio n�o criado");
		}
		try{
		    File file = new File(diretorio, "file.txt");// aqui eu posso botar 
		    // o arquivo file dentro do diretorio
		    if( file.createNewFile() ){
		        System.out.println("Arquivo criado");
		    }else{
		        System.out.println("Arquivo n�o criado");
		    }       
		}catch(IOException ex){
		    ex.printStackTrace();
		}

	}
}



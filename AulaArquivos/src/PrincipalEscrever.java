import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PrincipalEscrever {

	public static void main(String[] args) throws IOException {	
		        BufferedWriter arquivo = new BufferedWriter(new FileWriter("p3.txt")); 
		        // assim apaga tudo no arquivo e escreve novamente
		        // caso vc queira adicionar na ultima linha usar:
		        //BufferedWriter arquivo = new BufferedWriter(new FileWriter("p3.txt", true)); 	        
		        String linha = "";
		        Scanner in = new Scanner(System.in);
		        System.out.println("Escreva algo para colocar no arquivo p3.txt: ");
		        linha = in.nextLine(); // para pegar o que o user escreveu
		        try {
					arquivo.append(linha + "\n");//aequi eu escrevo
					System.out.println("escreve no arquivo");
				} catch (IOException e) {
								e.printStackTrace();
				} finally {
					arquivo.close();	
					System.out.println("fechar o arquivo sempre, mesmo se deu erro ou não");
		    }

	}
}

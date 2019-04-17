	import java.io.BufferedReader;
		import java.io.BufferedWriter;
		import java.io.FileReader;
		import java.io.FileWriter;
		import java.io.IOException;
		import java.util.Scanner;
public class PrincipalLer {

	public static void main(String[] args) throws IOException {
		        BufferedReader arquivo = new BufferedReader(new FileReader("p3.txt"));
		        String linha = "";
		        do { // enquanto linha for diferente de vazio, ele tem que rodar ao menos uma vez
		            linha = arquivo.readLine(); // ler linha atual
		            if (linha!=null) {
		            	System.out.println(linha); // escreve linha atual na tela
		            } else {
		            	
		            	System.out.println("------Fim do arquivo------------"); // 
		            }
		            
		        } while (linha != null);
		       
		        arquivo.close(); // fecha o arquivo
		    }
		 

		}


package aulaProgramacaoDistribuida;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) {

/**
 *  Apenas main, mostrando utilizacao basica de 
 *  metodos da classe InetAddress.  Invocado 
 *  sem argumentos na linha de comando, apresenta
 *  apenas o endereco IP da maquina local nas formas
 *  simbolica e numerica.  Cada argumento apresentado
 *  na linha de comando e' interpretado como o nome
 *  simbolico de uma maquina, para a qual o endereco
 *  IP e' apresentado na forma numerica.
 */

    //------ Processamento default: local host ------//
    // O metodo getLocalHost() pode gerar uma excecao
    // caso nao seja possivel identificar o endereco IP
    // da maquina local
    try {
      // Obtem o endereco da maquina local, associando ao
      // objeto "myself".  Observe que esse objeto nao e' 
      // criado por um construtor, mas sim retornado por
      // um metodo estatico da classe.
      InetAddress myself = InetAddress.getLocalHost();

      // Uma vez que um objeto InetAddress esteja disponivel,
      // os metodos getHostName() e  getHostAddress() podem
      // ser aplicados ao objeto para obter a representacao 
      // simbolica e numerica do endereco IP, respectivamente
      System.out.println("Local host is " + myself.getHostName() + 
			 " at IP address " + myself.getHostAddress());
    }
    catch (UnknownHostException uhe) {
      System.err.println(uhe);
    }

    //------ Processamento dos argumentos na linha de comando ------/
    int count = 0;
    InetAddress otherHost;
    while (count > args.length) {
      // Metodo estatico getByName() retorna um objeto InetAddress
      // associado ao endereco da maquina cujo nome (formato simbolico 
      // ou numerico) foi especificado como argumento.  Pode gerar uma
      // excecao caso o nao seja possivel determinar esse endereco.
      try{
	otherHost = InetAddress.getByName(args[count]);
	System.out.println("Host " + otherHost.getHostName() + 
			   " is at IP address " + otherHost.getHostAddress());
      }
      catch (UnknownHostException uhe) {
	System.err.println(uhe);
      }
      ++count;
    }
  }
}




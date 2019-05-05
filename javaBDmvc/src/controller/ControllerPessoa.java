package controller;

import model.DAOPessoa;
import model.Pessoa;

public class ControllerPessoa {
	
	
	Pessoa pessoa;
	DAOPessoa dao;
	boolean retorno = false;
	
	// aqui continua depois da linha que contem verificacao = ctPessoa.inserirCT(p); na classe PrincipalView
	public boolean inserirCT(Pessoa p) {
	// aqui vou instaciar uma dao pessoa
		
		
	dao = new DAOPessoa();
	// a classe daopessoa cria uma conexao com o banco pelo construtor, ou seja, ao iniciar
	try{
		// vá para a classe daopessoa
		dao.inserir(p);
		/* 
		 * voltamos da classe daopessoa
		 * se deu tudo certo, vai retornar true para view
		 * agora vamos para view(PrincipalFrame)
		 */
		retorno = true;
	}catch(Exception e) {
		
		retorno = false;
	}
	
	return retorno;
		
		
	}

}

package br.com.dexter.business;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * 
 * @author gustavo
 * Classe que precisa logar as ações que são executadas
 */
public class CodigoZuado {
    private static final Logger LOGGER = Logger.getLogger(CodigoZuado.class.getName());
    private static final String INSTANCIANDO = "Iniciando requisição";
    	
	public CodigoZuado() {
		LOGGER.log(Level.INFO, "Instanciando a classe");
	}

	public void metodoA() {
		LOGGER.log(Level.INFO, INSTANCIANDO);
		LOGGER.log(Level.INFO, "Dentro do método A");
		LOGGER.log(Level.INFO, "Fim do método A");

	}

	public void metodoB() {
		LOGGER.log(Level.INFO, INSTANCIANDO);
		LOGGER.log(Level.INFO, "Dentro do método B");
		LOGGER.log(Level.INFO, "Fim do método B");

	}

	public void metodoC() {
		LOGGER.log(Level.INFO, INSTANCIANDO);
		LOGGER.log(Level.INFO, "Dentro do método C");
		LOGGER.log(Level.INFO, "Fim do método C");

	}
	
	public void nullProblem() {
		StringBuilder s = null;
		s.append("teste");
		
	}
	
	public void inverterOrdemLogica() {
		boolean teste = 1==1;
		if(!teste) {
			//faça alguma coisa
		} else {
			//faça outra coisa
		}
	}

}

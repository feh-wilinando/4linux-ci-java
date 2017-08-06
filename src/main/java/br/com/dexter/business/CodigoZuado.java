package br.com.dexter.business;

/**
 * 
 * @author gustavo
 * Classe que precisa logar as ações que são executadas
 */
public class CodigoZuado {
	
	public CodigoZuado() {
		System.out.println("Instanciando a classe");
	}

	public void metodoA() {
		System.out.println("Iniciando requisição");
		System.out.println("Dentro do método A");
		System.out.println("Fim do método A");

	}

	public void metodoB() {
		System.out.println("Iniciando requisição");
		System.out.println("Dentro do método B");
		System.out.println("Fim do método B");

	}

	public void metodoC() {
		System.out.println("Iniciando requisição");
		System.out.println("Dentro do método C");
		System.out.println("Fim do método C");

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

package br.com.dexter.business;

/**
 * 
 * @author gustavo
 * Classe que precisa logar as ações que são executadas
 */
public class CodigoZuado {

    private static final String INSTANCIANDO = "Iniciando requisição";
    	
	public CodigoZuado() {
		System.out.println("Instanciando a classe");
	}

	public void metodoA() {
		System.out.println(INSTANCIANDO);
		System.out.println("Dentro do método A");
		System.out.println("Fim do método A");

	}

	public void metodoB() {
		System.out.println(INSTANCIANDO);
		System.out.println("Dentro do método B");
		System.out.println("Fim do método B");

	}

	public void metodoC() {
		System.out.println(INSTANCIANDO);
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

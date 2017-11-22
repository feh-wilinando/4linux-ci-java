package br.com.dexter.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.com.dexter.exception.CalcException;

public class CalculadoraTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldSum() {
		// 10+10 = 20
		Calculadora calc = new Calculadora();
		calc.number(10).mais().number(10);
		try {
			assertThat(calc.getResultado(), is(20));
		} catch (CalcException e) {
			// TODO Auto-generated catch block
		}
	}
	
	@Test
	public void shouldSubtract() {
		// 20-5 = 15
		Calculadora calc = new Calculadora();
		calc.number(20).menos().number(5);
		try {
			assertThat(calc.getResultado(), is(15));
		} catch (CalcException e) {
			// TODO Auto-generated catch block
		}
	}

	@Test(expected = CalcException.class)
	public void shouldThrowScriptException() throws CalcException {
		Calculadora calc = new Calculadora();
		calc.number(10).mais();
		calc.getResultado();
	}

	@Test
	public void testExceptionMessage() throws CalcException{
		Calculadora calc = new Calculadora();
		thrown.expect(CalcException.class);
        thrown.expectMessage("Expressao mal formatada");
		calc.number(10).mais();
		calc.getResultado();
		
	}

}

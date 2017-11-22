package br.com.dexter.business;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import br.com.dexter.exception.CalcException;

public class Calculadora {
	
	private final static Logger LOGGER = Logger.getLogger(Calculadora.class.getName());

	
	private StringBuilder expressao = new StringBuilder();
	
	public Calculadora number(Integer n) {
		expressao.append(n);
		return this;
	}
	
	public Calculadora number(Double n) {
		expressao.append(n);
		return this;
	}
	
	public Calculadora mais() {
		expressao.append("+");
		return this;
	}
	
	public Calculadora menos() {
		expressao.append("-");
		return this;
	}
	
	public Calculadora dividido() {
		expressao.append("/");
		return this;
	}
	
	public Calculadora vezes() {
		expressao.append("*");
		return this;
	}
	
	public final Object getResultado() throws CalcException {
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    Object resultado = null;
		try {
			resultado = engine.eval(expressao.toString());
		} catch (ScriptException e) {
			String error = "Expressao mal formatada";
			LOGGER.log(Level.SEVERE, error, e);
			throw new CalcException(error);
		}
		return resultado;
	}
	
	public Calculadora setExpressao(String expressao) {
		this.expressao = new StringBuilder(expressao);
		return this;
	}
	

}

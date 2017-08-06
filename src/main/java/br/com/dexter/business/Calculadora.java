package br.com.dexter.business;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculadora {
	
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
	
	public final Object getResultado() {
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    Object resultado = null;
		try {
			resultado = engine.eval(expressao.toString());
		} catch (ScriptException e) {
			e.printStackTrace();
			resultado = "Expressao "+expressao+ "mal formatada";
		}
		return resultado;
	}
	
	public Calculadora setExpressao(String expressao) {
		this.expressao = new StringBuilder(expressao);
		return this;
	}
	

}

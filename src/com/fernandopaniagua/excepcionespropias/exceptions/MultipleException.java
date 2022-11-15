package com.fernandopaniagua.excepcionespropias.exceptions;

import java.util.Stack;

public class MultipleException extends Exception {
	private Stack<Exception> exceptions = new Stack<Exception>();
	public Stack<Exception> getExceptions(){
		return this.exceptions;
	}
	public void addException(Exception e) {
		exceptions.push(e);
	}
	
}

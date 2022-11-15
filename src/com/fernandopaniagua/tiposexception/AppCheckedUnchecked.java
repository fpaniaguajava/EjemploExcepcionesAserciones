package com.fernandopaniagua.tiposexception;

public class AppCheckedUnchecked {
	public static void main(String[] args) {
		AppCheckedUnchecked app = new AppCheckedUnchecked();
		try {
			app.hacerAlgo1(0);
		} catch (EjemploCheckedException e) {
			e.printStackTrace();
		}
		// app.hacerAlgo2(0);
		app.hacerAlgo3(0);
	}

	/**
	 * Puede generar una checked exception --> Estamos obligados a gestionarla.
	 * 
	 * @param x
	 * @throws EjemploCheckedException 
	 */
	private void hacerAlgo1(int x) throws EjemploCheckedException {
		if (x == 0) {
			generarException();
		}
		return;
	}

	/**
	 * Puede generar una unchecked exception --> No es necesario gestionarlas.
	 * 
	 * @param x
	 */
	private void hacerAlgo2(int x) {
		int resultado = x / x;
		return;
	}

	/**
	 * Puede generar una unchecked exception --> No es necesario gestionarlas, pero
	 * podemos hacerlos.
	 * 
	 * @param x
	 */
	private void hacerAlgo3(int x) {
		int resultado = 0;
		try {
			resultado = x / x;
		} catch (ArithmeticException ae) {
			System.err.println("No puedes dividir entre 0");
			ae.printStackTrace();
			throw ae;
		}
		return;
	}
	
	/**
	 * Al heredar de RuntimeException, la propagación de EjemploUncheckedException
	 * no necesita indicarse en la cabecera.
	 * @param x
	 */
	private void hacerAlgo4(int x) {
		if (x==0) {
			throw new EjemploUncheckedException();
		}
		return;
	}

	private void generarException() throws EjemploCheckedException {
		throw new EjemploCheckedException();
	}
}

package com.fernandopaniagua.manejoexcepciones;

import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		System.out.println("Iniciando la tarea...");
		new App().doAction();
	}
	
	private void doAction() {
		try {
			int resultado = dividir(-5,5);
			System.out.println("Resultado:" + resultado);
			System.out.println("FIN");
		} catch (SQLException | ArithmeticException e) {
			System.err.println("Divisor 0");
		} catch (SimpleException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Error t) {
			t.printStackTrace();
		} finally {
			System.out.println("Siempre se ejecuta, tanto si hay Exception como si no");
		}
	}
	
	private int dividir(int dividendo, int divisor) throws ArithmeticException, SQLException, Exception {
		if (divisor==0) throw new Exception("El divisor no puede ser 0");
		if (dividendo>1000) throw new SQLException("El dividendo no puede > 1000");
		if (dividendo<0) throw new SimpleException("El dividendo no puede ser negativo");
		int resultado = dividendo / divisor;
		return resultado;
	}
}

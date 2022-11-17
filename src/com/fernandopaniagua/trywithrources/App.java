package com.fernandopaniagua.trywithrources;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws Exception {
		App miApp = new App();
		miApp.leerConTryWithResources();
		miApp.leerSinTryWithResources();
		miApp.ejecutarAlgoPropioConTryWithResources();
	}

	private void leerConTryWithResources() {
		// try-with-resources
		try (FileReader fr = new FileReader("d:/datos_prueba.txt"); BufferedReader br = new BufferedReader(fr)) {
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			};
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		};
	}
	
	private void leerSinTryWithResources() {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr = new FileReader("d:/datos_prueba.txt");
			br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			};
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br!=null) br.close();
				if (fr!=null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	private void ejecutarAlgoPropioConTryWithResources() throws IOException {
		try (Ejecutador ejecutador = new Ejecutador()){
			//No hacemos nada
		}
		System.out.println("Hemos terminado");
	}
}

class Ejecutador implements AutoCloseable {
	@Override
	public void close() throws IOException {
		System.out.println("Estoy cerrando el ejecutador");
	}
}

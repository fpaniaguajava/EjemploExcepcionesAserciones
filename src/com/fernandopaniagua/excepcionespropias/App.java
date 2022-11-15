package com.fernandopaniagua.excepcionespropias;

import java.util.Scanner;

import com.fernandopaniagua.excepcionespropias.exceptions.AnyoInsuficienteException;
import com.fernandopaniagua.excepcionespropias.exceptions.MultipleException;
import com.fernandopaniagua.excepcionespropias.exceptions.NombreCortoException;
import com.fernandopaniagua.excepcionespropias.exceptions.ValidacionException;
import com.fernandopaniagua.excepcionespropias.model.Cliente;
import com.fernandopaniagua.excepcionespropias.model.Empleado;
import com.fernandopaniagua.excepcionespropias.model.Proveedor;

public class App {

	public static void main(String[] args) {
		new App().doAction();
	}
	private void doAction() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nombre:");
		String nombre = sc.nextLine();
		System.out.print("Año de nacimiento:");
		Integer anyo = Integer.parseInt(sc.nextLine());
		System.out.print("Ciudad:");
		String ciudad = sc.nextLine();
		
		System.out.println("***CLIENTES***");
		try {
			Cliente c = new Cliente(nombre, anyo, ciudad);
		} catch (NombreCortoException e) {
			System.err.println("ACCION DE NCE");
		} catch (AnyoInsuficienteException e) {
			System.err.println("ACCION DE AIE");
		} catch (Exception e) {
			System.err.println("ACCION DE E");
		}
		
		System.out.println("***PROVEEDORES***");
		try {
			Proveedor p = new Proveedor(nombre, anyo, ciudad);
		} catch (ValidacionException ve) {
			if (ve.getErrorCode()==ValidacionException.NOMBRE_CORTO) {
				ve.mostrarMensaje();
			} else if (ve.getErrorCode()==ValidacionException.ANYO_INSUFICIENTE) {
				ve.mostrarMensaje();
			}
		}
		System.out.println("***EMPLEADOS***");
		try {
			Empleado p = new Empleado(nombre, anyo, ciudad);
		} catch (MultipleException me) {
			
			while(!me.getExceptions().empty()) {
				Exception e = me.getExceptions().pop();
				System.err.println(e.getMessage());
			}
		}
	}
}

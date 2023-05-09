package examen;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.Scanner;
import examen.Empleado.Sexo;

public class ListadoEmpleados {

	/**
	 * Se guardara la lista de los empleados
	 */
	static Empleado[] listaEmpleado = new Empleado[10];

	static Scanner read = new Scanner(System.in);

	private void listaNull() {
		for (int i = 0; i < listaEmpleado.length; i++) {
			listaEmpleado[i] = null;
		}
	}

	/**
	 * Método que hace una busqueda de una posicion libre
	 * 
	 * @return
	 */
	public static int posicionLibre() {
		// Declaro e inicializo un indice a 0
		int indice = 0;
		/*
		 * Mientras que el indice sea menor que la longitud del array y el contenido de
		 * la posicion sea distinto de null
		 */
		while (indice < listaEmpleado.length && listaEmpleado[indice] != null) {
			// Se sumará uno a indice
			indice++;
		}
		// Devolvemos el indice
		return indice;
	}

	/**
	 * Método que busca a un empleado
	 * 
	 * @param e
	 * @return
	 */
	public static int buscaEmpleado(Empleado e) {
		int result = -1;
		for (int i = 0; i < listaEmpleado.length; i++) {
			if (listaEmpleado[i].equals(e)) {
				result = i;
			}
		}
		return result;
	}

	/**
	 * Método que mostara al usuario todos los empleados
	 */
	public static void listarEmpleados() {
		for (Empleado values : listaEmpleado) {
			System.out.println(values);
		}
	}

	/**
	 * Método que añade un empleado
	 * 
	 * @param emp
	 */
	public static void añadirEmpleado(Empleado emp, String tipo) {

		// Si el empleado que busco está en la posicion i
		if (buscaEmpleado(emp) >= 0) {
			// Se le mostrará un mensaje de que ya existe
			System.out.println("El empleado a introducir ya existe");
			// De lo contrario
		} else {
			switch (tipo) {
			case "Fijo":
				Fijo fijo = (Fijo) emp;

				// Solicito el sueldo
				System.out.println("Introduzca el sueldo del empleado");
				fijo.sueldo = read.nextDouble();

				break;
			case "PorHoras":
				PorHoras porhora = (PorHoras) emp;

				// Solicitamos los datos especificos
				System.out.println("Número de horas a trabajar");
				porhora.horas = read.nextInt();

				System.out.println("Sueldo por hora");
				porhora.sueldoHora = read.nextDouble();

				break;
			case "AComision":
				AComision acom = (AComision) emp;

				// Solictamos los datos especificos
				System.out.println("Introduzca las ventas");
				acom.ventas = read.nextDouble();

				System.out.println("Introduzca el porcentaje");
				acom.porcentaje = read.nextDouble();

				break;
			default:
				System.out.println("ERROR");
			}

		}
		// Añadimos el objeto a la posicion del array
		listaEmpleado[buscaEmpleado(emp)] = emp;
	}

	/**
	 * Método que modifica algunos datos del empleado
	 * @param emp
	 */
	public static void modificarEmpleado(Empleado emp) {
		int opcion = 0;
		//Si el empleado no se encuentra en el array
		if (buscaEmpleado(emp) < 0) {
			//Se le mostrará de que no existe
			System.out.println("No existe el empleado deseado");
			//Por el contrario
		} else {
			//Si el tipo es igual a Fijo
			if (emp.getClass().equals("Fijo")) {
				//Hago un cast a fijo
				Fijo fijo = (Fijo) emp;
				//Y solicito el nuevo sueldo
				System.out.println("Introduzca el nuevo sueldo");
				fijo.sueldo = read.nextDouble();
			//Si el tipo de empleado es igual a por horas
			} else if (emp.getClass().equals("PorHoras")) {
				//Hago cast
				PorHoras porHora = (PorHoras) emp;
				//Ordeno que haga
				do {
	
					//Solicite una opcion
					System.out.println("1. Desea modificar las horas");
					System.out.println("2. Desea modificar el sueldo segun las horas");
					opcion = read.nextInt();
					//Creo un switch con la opcion  
					switch (opcion) {
					//En el primer case 
					case 1:
						//Solicitara modificar un atributo
						System.out.println("Introduzca cantidad de horas nueva");
						porHora.horas = read.nextInt();
						break;
					//En el caso 2, el otro atributo
					case 2:
						System.out.println("Introduzca el sueldo segun las horas");
						porHora.sueldoHora = read.nextDouble();
						break;
					
					case 0:
						System.out.println("Saliendo a la pantalla anterior");
						break;
					default:
						System.out.println("ERROR, introduzca una opcion correcta");
					}
				//Mientras que la opcion sea distinta de cero
				} while (opcion != 0);
			} else if (emp.getClass().equals("AComision")) {
				AComision acom= (AComision) emp;
				do {
					System.out.println("1. Desea modificar las ventas");
					System.out.println("2. Desea modificar el porcentaje");
					opcion = read.nextInt();
					switch (opcion) {
					case 1:
						System.out.println("Introduzca la nueva cantidad de ventas");
						acom.ventas= read.nextDouble();
						System.out.println("Introduzca el porcentaje");
						acom.porcentaje= read.nextDouble();

					}
				} while (opcion != 0);
			}
		}
	}

	/**
	 * Método que elimina el empleado
	 * 
	 * @param emp
	 */
	public static void eliminarEmpleado(Empleado emp) {
		// Si el empleado se encuentra en el array
		if (buscaEmpleado(emp) >= 0) {
			// Su casilla se volverá null
			listaEmpleado[buscaEmpleado(emp)] = null;
		}
	}

	/**
	 * Método que guardaran las preguntas frecuentes que comparten todos los
	 * empleados
	 * 
	 * @param emp
	 */
	public static void PreguntasFrecuentes(Empleado emp) {
		System.out.println("Introduzca el nombre del empleado");
		emp.nombre = read.next();
		read.nextLine();
		System.out.println("Introduzca los apellidos del empleado");
		emp.apellidos = read.nextLine();
		System.out.println("Introduzca el sexo del empleado");
		emp.sexo = Sexo.valueOf(read.next());
	}

}

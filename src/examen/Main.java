package examen;

import examen.Empleado.Sexo;

public class Main {

	public static void main(String[] args) {
		int opcion =0;
		
		String tipo="";
		String nombre="";
		String apellidos="";
		
		Empleado emp= new Empleado("Paco", "Sanchez Moreno", "H");
		
		do {
			//Solicitamos una opcion
			System.out.println("Bienvenido");
			System.out.println("¿Qué desea hacer?");
			System.out.println("1. Añadir empleado");
			System.out.println("2. Listar empleados");
			System.out.println("3. Modificar empleado");
			System.out.println("4. Eliminar empleado");
			System.out.println("0. Salir");
			opcion= ListadoEmpleados.read.nextInt();
			
			switch (opcion) {
			case 1: 
				//Solicitamos el tipo de empleado
				System.out.println("Introduzca el tipo de empleado");
				tipo=ListadoEmpleados.read.next();
				ListadoEmpleados.read.nextLine();
				
				ListadoEmpleados.PreguntasFrecuentes(emp);
				
				ListadoEmpleados.añadirEmpleado(emp, tipo);
				System.out.println("El empleado se ha introducido correctamente");
				System.out.println();
			
				break;
			//En el caso 2
			case 2: 
				ListadoEmpleados.listarEmpleados();
				break;
			//En el caso 3
			case 3: 
				System.out.println("Introduzca el tipo de empleado");
				tipo=ListadoEmpleados.read.next();
				
				ListadoEmpleados.PreguntasFrecuentes(emp);
				
				ListadoEmpleados.modificarEmpleado(emp);
				break;
			//En el caso 4
			case 4:
				//Llamamos a la funcion eliminar empleado
				ListadoEmpleados.eliminarEmpleado(emp);
				break;
			case 0:
				System.out.println("Saliendo del sistema…");
				break;
			default: 
				System.out.println("ERROR, introduzca otra opcion");
				System.out.println();
			}
			
		}while (opcion!=0);
		

	}

}

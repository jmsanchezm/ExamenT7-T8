package examen;

public class Fijo extends Empleado {

	protected double sueldo=100;

	/**
	 * Constructor con parametros de la clase padre
	 * 
	 * @param nombre
	 * @param apellido
	 */
	public Fijo(String nombre, String apellido) {
		super(nombre, apellido);
	}

	/**
	 * Constructor con todos los parametros
	 * @param nombre
	 * @param apellido
	 * @param sexo
	 * @param sueldo
	 */
	public Fijo(String nombre, String apellido, String sexo, double sueldo) {
		super(nombre, apellido, sexo);
		if (sueldo > 0) {
			this.sueldo = sueldo;
		}
	}

	
	
	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public double calculaSalario() {
		return sueldo;
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		String res= super.toString();
		res = "Tipo: Fijo\n" + "Sueldo: " + sueldo;
		return res;
	}

	
	
}

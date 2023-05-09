package examen;

public class PorHoras extends Empleado {

	protected int horas = 1;
	protected double sueldoHora = 10;

	/**
	 * Constructor con parametros de la clase padre
	 * 
	 * @param nombre
	 * @param apellido
	 */
	public PorHoras(String nombre, String apellido) {
		super(nombre, apellido);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nombre
	 * @param apellido
	 * @param sexo
	 * @param horas
	 * @param sueldoHora
	 */
	public PorHoras(String nombre, String apellido, String sexo, int horas, double sueldoHora) {
		super(nombre, apellido, sexo);
		if (horas > 0) {
			this.horas = horas;
		}
		if (sueldoHora > 0) {
			this.sueldoHora = sueldoHora;
		}
	}

	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}

	/**
	 * @return the sueldoHora
	 */
	public double getSueldoHora() {
		return sueldoHora;
	}

	/**
	 * @param sueldoHora the sueldoHora to set
	 */
	public void setSueldoHora(double sueldoHora) {
		this.sueldoHora = sueldoHora;
	}

	/**
	 * Método que calcula el salario del empleado que trabaja por horas
	 */
	@Override
	public double calculaSalario() {
		double res = horas * sueldoHora;
		return res;
	}

	@Override
	public String toString() {
		String res = super.toString();
		res = "Tipo: Por Horas\n" + "Sueldo por horas trabajadas: " + sueldoHora + "\nCantidad de horas trabajadas: "
				+ horas;
		return res;
	}

}

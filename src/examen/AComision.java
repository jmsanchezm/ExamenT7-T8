package examen;

public class AComision extends Empleado {

	/**
	 * Se guardara las ventas del empleado
	 */
	protected double ventas;
	/**
	 * Se guardara el porcentaje de comision por cada venta
	 */
	protected double porcentaje;

	/**
	 * Constructor con parametros de la clase padre
	 * 
	 * @param nombre
	 * @param apellido
	 */
	public AComision(String nombre, String apellido) {
		super(nombre, apellido);
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nombre
	 * @param apellido
	 * @param sexo
	 */
	public AComision(String nombre, String apellido, String sexo, double ventas, double porcentaje) {
		super(nombre, apellido, sexo);
		if (ventas > 0) {
			this.ventas = ventas;
		}
		if (porcentaje > 0) {
			this.porcentaje = porcentaje;
		}
	}

	@Override
	public double calculaSalario () {
		double res= ventas * (porcentaje/100);
		return res;
	}
	
	@Override
	public String toString() {
		String res = super.toString();
		res = "Tipo: a Comisión\n" + "Importe: " + ventas + "\nPorcentaje de venta: " + porcentaje;
		return res;
	}
}

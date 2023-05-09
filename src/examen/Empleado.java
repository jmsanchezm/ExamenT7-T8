package examen;

public abstract class Empleado implements Comparable{

	/**
	 * Se guardara el nombre del empleado
	 */
	protected String nombre="";
	/**
	 * Se guardara el apellido del empleado
	 */
	protected String apellidos = "";
	/**
	 * Se guardara el sexo del empleado
	 */
	protected Sexo sexo = Sexo.H;

	/**
	 * Enum sobre los distintos valores que puede tomar Sexo
	 * 
	 * @author jmmoreno
	 *
	 */
	enum Sexo {
		H, M
	}

	/**
	 * Constructor con dos parametros
	 * 
	 * @param nombre
	 * @param apellido
	 */
	public Empleado(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellidos = apellido;
	}

	/**
	 * Constructor con todos los atributos
	 * 
	 * @param nombre
	 * @param apellido
	 * @param sexo
	 */
	public Empleado(String nombre, String apellido, String sexo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellido;
		this.sexo = Sexo.valueOf(sexo);
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellidos;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellidos = apellido;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return ;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = Sexo.valueOf(sexo);
	}

	/**
	 * Método toString
	 */
	public String toString() {
		String res;
		res = "Empleado" + nombre + " " + apellidos + "\nSexo: " + sexo;
		return res;
	}

	/**
	 * Método equals que compara dos objetos
	 */
	public boolean equals(Object o) {
		// Declaramos e inicializamos la variable res
		boolean res = false;
		// Igualamos el objeto de parametro de entrada al objeto emp.
		// A este objeto pasado por parametro le hacemos un cast a Empleado
		Empleado emp = (Empleado) o;
		// Si el nombre es igual al nombre de emp y al apellido
		if (nombre.equals(emp.nombre) && apellidos.equals(emp.apellidos)) {
			// res será igual a true
			res = true;
		}

		//Devolvemos el resultado de res
		return res;
	}

	/**
	 * Método abstracto que será diferente en funcion del tipo de empleado
	 * @return Devolverá el salario del empleado
	 */
	public abstract double calculaSalario ();
	
	/**
	 * Método compareTo
	 * @param o
	 * @return
	 */
	public int compareTo(Object o) {
		int res=1;
		Empleado emp = (Empleado) o;
		if (apellidos.equals(emp.apellidos)) {
			if (nombre.equals(emp.nombre)) {
				res=0;
			}
		}
		return res;
	}
	
}

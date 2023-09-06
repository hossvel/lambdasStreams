package operacionesParticion;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String ciudad;
	private double avgGrade;
	private int edad;
	public Estudiante(String nombre, String apellido, String ciudad, double avgGrade, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
		this.avgGrade = avgGrade;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public double getAvgGrade() {
		return avgGrade;
	}
	public void setAvgGrade(double avgGrade) {
		this.avgGrade = avgGrade;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString()
	{
		return nombre + " " + edad + " " + avgGrade;
	}

	public boolean calificacionExcelente() {

		return this.avgGrade>=10.0?true:false;
	}
}

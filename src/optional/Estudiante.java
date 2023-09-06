package optional;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String email;
	private double avgGrade;
	private int edad;
	public Estudiante(String nombre, String apellido, String email, double avgGrade, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
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

	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString()
	{
		return nombre + " " + email + " " + apellido;
	}

	public boolean calificacionExcelente() {

		return this.avgGrade>=10.0?true:false;
	}
}

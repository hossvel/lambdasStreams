package metodosReferenciados;

public class Persona {

	private String nombre;
	private Integer edad;
	private String email;
	public Persona(String nombre, Integer edad, String email) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

package interfaceConsumer;

public class Estudiante {

	private String nombre;
	private Double calificacion;

	public Estudiante(String nombre, Double calificacion) {
		super();
		this.nombre = nombre;
		this.calificacion = calificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}


}

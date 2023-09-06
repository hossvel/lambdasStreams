package streams;

import java.util.List;

public class Empleado {

	private long id;
	private String nombre;
	private Double ingresos;
	private int edad;
	private Genero genero;
	
	
	public Empleado(long id, String nombre, Double ingresos, int edad, Genero genero) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ingresos = ingresos;
		this.edad = edad;
		this.genero = genero;
	}
	
	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Double getIngresos() {
		return ingresos;
	}



	public void setIngresos(Double ingresos) {
		this.ingresos = ingresos;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public Genero getGenero() {
		return genero;
	}



	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public boolean esHombre() {
		return this.genero== Genero.HOMBRE;
	}

	public boolean esMujer() {
		return this.genero== Genero.MUJER;
	}

	public static enum Genero {HOMBRE,MUJER}
	
	
	public static List<Empleado> generarEmpleados(){
		
		return List.of(new Empleado(1, "hh", 1500.0, 25, Genero.HOMBRE),
				       new Empleado(2, "rr", 1200.0, 45, Genero.MUJER),
				       new Empleado(4, "ss", 1700.0, 75, Genero.HOMBRE),
				       new Empleado(3, "tt", 1900.0, 35, Genero.MUJER));
		
				         
	}
	
	@Override
	public String toString()
	{
		return nombre + " " + edad + " " + ingresos  + " " + genero;
	}

}

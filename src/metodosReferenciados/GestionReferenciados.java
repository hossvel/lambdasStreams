package metodosReferenciados;

public class  GestionReferenciados {

	public static int compararEdad(Persona p1, Persona p2) {
		return p1.getEdad().compareTo(p2.getEdad());
	
	}
	
	public int compararPorNombre(Persona p1, Persona p2) {
		return p1.getNombre().compareTo(p2.getNombre());
	
	}
	
}

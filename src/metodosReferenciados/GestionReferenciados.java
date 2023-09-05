package metodosReferenciados;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class  GestionReferenciados {

	public static int compararEdad(Persona p1, Persona p2) {
		return p1.getEdad().compareTo(p2.getEdad());

	}

	public int compararPorNombre(Persona p1, Persona p2) {
		return p1.getNombre().compareTo(p2.getNombre());

	}

	public List<Integer> getResults(List<String> lista1, Function <String, Integer> fn) {

		List<Integer> listareturn = new ArrayList<>();
		lista1.forEach(x-> listareturn.add(fn.apply(x)));
		return listareturn;	

	}
}

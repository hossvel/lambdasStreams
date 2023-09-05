package metodosReferenciados;

import java.util.ArrayList;
import java.util.List;

public class ReferenciadosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//GestionReferenciados g1 = new GestionReferenciados();

		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona("p1", 21, "hh"));
		lista.add(new Persona("p2", 32, "hh"));
		lista.add(new Persona("p3", 13, "hh"));
		lista.add(new Persona("p4", 4, "hh"));

		System.out.println("Inicial");
		lista.forEach(p1 -> System.out.println(p1.getNombre() + "-"+ p1.getEdad()  ));


		System.out.println("Ordenado por expresion lambda");
		lista.sort((p1,p2) -> p1.getEdad().compareTo(p2.getEdad()));
		lista.forEach(p1 -> System.out.println(p1.getNombre() + "-" + p1.getEdad()));
		
		
		System.out.println("Ordenado metodo estatico en otra clase");
		lista.sort((p1,p2) -> GestionReferenciados.compararEdad(p1, p2));
		lista.forEach(p1 -> System.out.println(p1.getNombre() + "-" + p1.getEdad()));
		
				
		System.out.println("Ordenado metodo referencia");
		lista.sort(GestionReferenciados::compararEdad);
		lista.forEach(p1 -> System.out.println(p1.getNombre() + "-" + p1.getEdad()));

	}

}

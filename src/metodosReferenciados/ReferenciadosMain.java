package metodosReferenciados;

import java.util.ArrayList;
import java.util.List;

public class ReferenciadosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona("p1", 21, "hh"));
		lista.add(new Persona("p4", 32, "hh"));
		lista.add(new Persona("p3", 13, "hh"));
		lista.add(new Persona("p2", 4, "hh"));

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

		
		System.out.println("*****Referencia Por metodo cualquiera mediante instancia****");
		
		GestionReferenciados g1 = new GestionReferenciados();
		System.out.println("expresion lambda");
		lista.sort((p1,p2) -> g1.compararPorNombre(p1, p2));
		lista.forEach(p1 -> System.out.println(p1.getNombre() + "-" + p1.getEdad()));
		
		System.out.println("Referencia Por metodo cualquiera metodo de referencia");
		lista.add(new Persona("p6", 6, "hh"));
		lista.sort(g1::compararPorNombre);
		lista.forEach(p1 -> System.out.println(p1));
		
		System.out.println("*****Referencia Por metodo  contructor****");
		List<String> listastring = List.of("1", "8", "5", "6", "9");
		
		System.out.println("expresion lambda");
		List<Integer> listasint = g1.getResults(listastring, r-> Integer.valueOf(r));
		listasint.forEach(x -> System.out.println(x));
		
		//System.out.println("Referencia Por metodo Constructor");
		//List<Integer> listasintC = g1.getResults(listastring,Integer::new);
		//listasintC.forEach(x -> System.out.println(x));
		
	}

}

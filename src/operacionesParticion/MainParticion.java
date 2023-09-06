package operacionesParticion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainParticion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nombres = Arrays.asList("aaa","bbbb","cccc","eee","ggggg");

		Map<Boolean,  List<String>>  partionedBy = 
				nombres
				.stream()
				.collect(Collectors.partitioningBy(x -> x.length()>3)); 
		System.out.println(partionedBy);
		
		System.out.println("ESTUDIANTE");
		Map<Boolean,  List<Estudiante>>  partionedByCalificacion = 
				MainParticion.getdata()
			            .stream()
			            .collect(Collectors.partitioningBy(Estudiante::calificacionExcelente)); 
			    System.out.println(partionedByCalificacion);
		
	}

	public static List<Estudiante> getdata(){

		return List.of(
				new Estudiante("a1", "ap1", "c1", 12, 18),
				new Estudiante("a2", "ap2", "c1", 6, 15),
				new Estudiante("a3", "ap3", "c2", 9, 16),
				new Estudiante("a4", "ap4", "c2", 16, 20),
				new Estudiante("a5", "ap3", "c1", 14, 22));
	}

}

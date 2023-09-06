package operacionesParticion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainParticion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**************************partitioningBy*******************************************");

		List<String> nombres = Arrays.asList("aaa","bbbb","cccc","eee","ggggg");

		System.out.println("ESTUDIANTE particiona por tamanio>3");
		System.out.println("Entrada" + nombres);
		Map<Boolean,  List<String>>  partionedBy = 
				nombres
				.stream()
				.collect(Collectors.partitioningBy(x -> x.length()>3)); 
		System.out.println("RESULTADO: " + partionedBy);

		System.out.println("ESTUDIANTE particiona por calificacion mayor a 10");
		System.out.println("ENTRADA"+MainParticion.getdata());
		Map<Boolean,  List<Estudiante>>  partionedByCalificacion = 
				MainParticion.getdata()
				.stream()
				.collect(Collectors.partitioningBy(Estudiante::calificacionExcelente)); 
		System.out.println("RESULTADO: " + partionedByCalificacion);

		System.out.println("**************************groupingBy*******************************************");

		System.out.println("***** groupingBy CIUDAD***");
		System.out.println("ENTRADA"+MainParticion.getdata());
		Map<String,  List<Estudiante>>  groupingBy = 
				MainParticion.getdata()
				.stream()
				.collect(Collectors.groupingBy(c->c.getCiudad())); 
		System.out.println("RESULTADO: " + groupingBy);


		System.out.println("***ESTUDIANTE groupingBy getGrade***");
		List<Student> students = Arrays.asList(new Student("Tom", "A+", 90),
				new Student("Lisa", "A+", 98),
				new Student("John", "A", 85),
				new Student("Joe", "A", 80),
				new Student("Jason", "E", 35));

		System.out.println("ENTRADA"+ students);
		Map<String, List<Student>> studentsByGrade
		= students.stream()
		.collect(Collectors.groupingBy(Student::getGrade));
		System.out.println("RESULTADO: ");
		for (Map.Entry<String, List<Student>> entry: studentsByGrade.entrySet()) {
			System.out.println("Students with " + entry.getKey() +
					" grade are " + entry.getValue());
		}

		System.out.println("***ESTUDIANTE groupingBy getGrade  y promedio de notas***");

		List<Student> students1 = Arrays.asList(
				new Student("Tom", "A+", 50),
				new Student("Lisa", "A+", 10),
				new Student("John", "A", 20),
				new Student("Joe", "A", 30),
				new Student("Jason", "E", 40));

		Map<String, Double> studentsByGrade1 =
				students1.stream()
				.collect(Collectors.groupingBy(Student::getGrade,
						Collectors.averagingInt(Student::getMarks)));

		for (Map.Entry<String, Double> entry: studentsByGrade1.entrySet()) {
			System.out.println("Students with " + entry.getKey() +
					" grade have average marks of " + entry.getValue());
		}

		System.out.println("***conteo***");

		Map<String, Long> freq = Stream.of("A", "B", "A", "C", "A", "C")
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(freq);

		
		System.out.println("**************************minBy y maxBy*******************************************");

		
		  Payroll p1 = new Payroll("Employee1", 50);
	        Payroll p2 = new Payroll("Employee2", 10);
	        Payroll p3 = new Payroll("Employee3", 20);
	 
	        List<Payroll> salaries = Arrays.asList(p1, p2, p3);
	 
	        // obtener una persona con el ingreso minimo
	        Payroll min = salaries.stream()
	                            .collect(Collectors.minBy(
	                                Comparator.comparingInt(Payroll::getIncome)))
	                            .get();
	        System.out.println("Employee with minimum Salary " + min);
	 
	        // obtener una persona con el ingreso máximo
	        Payroll max = salaries.stream()
	                            .collect(Collectors.maxBy(
	                                Comparator.comparingInt(Payroll::getIncome)))
	                            .get();
	        System.out.println("Employee with maximum Salary " + max);
	        
	        
	        System.out.println("**************************joining(delimiter)*******************************************");
	        List<String> colors = Arrays.asList("RED", "BLUE", "BLACK", "GREEN");
	        
	        // Convertir elementos a strings y concatenarlos, separados por comas
	        String joined = colors.stream().collect(Collectors.joining(", "));
	 
	        System.out.println(joined);
	        
	       
	        
	        String joinedprefix = colors.stream().collect(Collectors.joining(", ", "{", "}"));
	 
	        System.out.println(joinedprefix);
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

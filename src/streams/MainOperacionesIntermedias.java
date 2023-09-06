package streams;

import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class MainOperacionesIntermedias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*****Filter*****");
		Empleado.generarEmpleados()
		.stream()
		.filter(new Predicate<Empleado>() {
			@Override
			public boolean test(Empleado e) {
				return e.esHombre();
			}
		})
		.forEach(System.out::println);


		Empleado.generarEmpleados()
		.stream()
		.filter(e1 -> e1.esMujer())
		.forEach(System.out::println);

		Empleado.generarEmpleados()
		.stream()
		.filter(Empleado::esHombre)
		.forEach(System.out::println);

		System.out.println("*****map*****");

		IntStream.rangeClosed(1, 10)
		.map(new IntUnaryOperator() {
			@Override
			public int applyAsInt(int n) {
				return n*n;
			}
		})
		.forEach(System.out::println);

		System.out.println("*****map lambda*****");
		IntStream.rangeClosed(1, 10)
		.map(x-> x*2)
		.forEach(System.out::println);


		System.out.println("*****mujer mayor a 25 promedio de sueldo *****");
		Double promedio = Empleado.generarEmpleados()
		.stream()
		.filter(e-> e.esMujer())
		.filter(e-> e.getEdad()>25)
		.mapToDouble(e-> e.getIngresos())
		.average().getAsDouble();
		System.out.println("PROMEDIO: " + promedio);
		
		
		
	}

}

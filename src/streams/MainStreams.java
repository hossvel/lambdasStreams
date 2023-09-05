package streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStreams {

	public static void main(String[] args) {

		//System.out.println("Hola Mundo");

		Stream<String> s1 = Stream.of("Hola Mundo Stream!!");
		s1.forEach(x -> System.out.println(x));

		Stream<String> s2 = Stream.of("a","b","c");
		s2.forEach(System.out::println);

		System.out.println("Range");
		IntStream i1 =  IntStream.range(0, 9);
		i1.forEach(System.out::println);

		System.out.println("funciones iterate");
		Stream<Long> primerodiez = Stream.iterate(1L, n -> n+1).limit(10);
		primerodiez.forEach(System.out::println);

		System.out.println("funciones iterate sin asignar");
		Stream.iterate(1L,n -> n+1).filter(x-> x%2==0).limit(5).forEach(System.out::println);

		System.out.println("funciones iterate sin skyp");
		Stream.iterate(1L,n -> n+1)
		.filter(x-> x%2==0)
		.skip(50)
		.limit(15)
		.forEach(System.out::println);
		
		System.out.println("funciones generate");
		Stream.generate(Math::random).limit(5).forEach(System.out::println);
		System.out.println("funciones generate 1");
		DoubleStream.generate(Math::random).limit(5).forEach(System.out::println);
		System.out.println("funciones generate 2");
		new Random().ints().limit(5).forEach(System.out::println);
	}
}

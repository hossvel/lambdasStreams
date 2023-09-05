package interfaceConsumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMain {

	public static void main(String[] args) {

		GestionConsumer g1 = new GestionConsumer();
		System.out.println("example01");
		Consumer<Integer> c1 = t -> System.out.println(t);
		c1.accept(6);

		System.out.println("example02");
		g1.calc(t -> System.out.println(t*2), List.of(1,2,3,4,5,6,7,8,9));
		System.out.println("example03");
		g1.calc1(t -> System.out.println(t.getNombre()), List.of(new Estudiante("HH1", 12.0),new Estudiante("RR1", 16.0)));

		System.out.println("example04");
		List<Estudiante> listae  = List.of(new Estudiante("HH", 14.0),new Estudiante("RR", 18.0));

		Consumer<Estudiante> c11 = t -> t.setCalificacion(t.getCalificacion()*2.0);
		Consumer<Estudiante> c12 = t -> System.out.println(t.getCalificacion());

		g1.calc1(c11,listae);
		g1.calc1(c12,listae);

		System.out.println("example05");
		Consumer<Estudiante> c13 = c12.andThen(c11);

		g1.calc1(c13,listae);


		System.out.println("***BICONSUMER**");
		System.out.println("example01");
		BiConsumer<Integer,Integer> b1 = (t,u)-> System.out.println(t*u);
		b1.accept(6,8);

		System.out.println("example02");
		Map<String, Integer> map = new HashMap<>();

		map.put("geeks", 55);
		map.put("for", 13);
		map.put("geeks", 22);
		map.put("is", 11);
		map.put("heaven", 90);
		map.put("for", 100);
		map.put("geekies like us", 96);

		map.forEach((k,v) -> System.out.println(k + " - " + v));

	}

}
